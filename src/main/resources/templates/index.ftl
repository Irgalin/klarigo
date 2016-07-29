<#ftl encoding="UTF-8">
<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<!--[if lt IE 7]>      <html lang="en" ng-app="app" class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html lang="en" ng-app="app" class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html lang="en" ng-app="app" class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en" ng-app="app" class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Klarigo</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="/webjars/angularjs/1.5.0/angular.js"></script>
    <script src="/webjars/angularjs/1.5.0/angular-resource.js"></script>
    <script src="/webjars/angularjs/1.5.0/angular-route.js"></script>
    <script src="webjars/jquery/2.2.0/jquery.min.js"></script>
    <script src="/js/app.js"></script>
    <script src="/js/controllers.js"></script>
    <link rel="stylesheet" href="/css/app.css"/>
</head>
<body>
    <script>
        angular.element(document).ready(function () {
            location.href = '#/video';
        });
    </script>
    <div class="wrapper">

        <div class="header">
            <div class="logo"></div>
            <div class="title">
                Klarigo
            </div>
            <div class="search"></div>
            <div>
            <#if currentLanguage == "ru">
                <a class="lang-switch-link" href="?lang=en"><@spring.message code="lang.switch.link.text"/></a>
            </#if>
            <#if currentLanguage == "en">
                <a class="lang-switch-link" href="?lang=ru"><@spring.message code="lang.switch.link.text"/></a>
            </#if>
            </div>
        </div>

        <ul class="nav" ng-controller="navigationBarController">
            <li class="nav__item">
                <a class="nav__link" ng-class="{'nav__link--active': isActive('/video')}"
                   href="#/video"><@spring.message code="nav.video"/></a>
            </li>
            <li class="nav__item">
                <a class="nav__link" ng-class="{'nav__link--active': isActive('/blog')}"
                   href="#/blog"><@spring.message code="nav.blog"/></a>
            </li>
            <li class="nav__item">
                <a class="nav__link" ng-class="{'nav__link--active': isActive('/about')}"
                   href="#/about"><@spring.message code="nav.about"/></a>
            </li>
            <li class="nav__item">
                <a class="nav__link" ng-class="{'nav__link--active': isActive('/contacts')}"
                   href="#/contacts"><@spring.message code="nav.contacts"/></a>
            </li>
        </ul>

        <div class="content" ng-view>
        </div>
        <div class="footer">
        </div>
    </div>
</body>
</html>