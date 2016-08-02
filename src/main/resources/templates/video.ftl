<#ftl encoding="UTF-8">
<#import "/spring.ftl" as spring/>
<#import "common.ftl" as common/>

<@common.html>
    <@common.head/>
    <@common.body mode="video" language='${currentLanguage}'>
    <div class="video-list">
        <div class="video-item">
            <div class="item-title">
                Some title
            </div>
            <div class="item-date-time-posted">
                8/2/2016 12:12 PM
            </div>
            <iframe class="video" width="420" height="315"
                    src="https://www.youtube.com/embed/OhL0pmCVGdY"
                    webkitallowfullscreen
                    mozallowfullscreen
                    allowfullscreen>
            </iframe>
            <div class="item-description">
                Some description, rfefeferfrer, ferfrefre
            </div>
        </div>
    </div>
    </@common.body>
</@common.html>