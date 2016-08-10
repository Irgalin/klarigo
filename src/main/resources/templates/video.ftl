<#ftl encoding="UTF-8">
<#import "/spring.ftl" as spring/>
<#import "common.ftl" as common/>

<@common.html>
    <@common.head/>
    <@common.body mode="video" language='${currentLanguage}'>
        <#if videoList??>
        <div class="video-list">
            <#list videoList as video>
                <@videoItem video.title video.posted video.videourl video.description />
            </#list>
        </div>
        </#if>
    </@common.body>
</@common.html>

<#macro videoItem title posted videourl description>
<div class="video-item">
    <div class="item-title">
    ${title}
    </div>
    <div class="item-date-time-posted">
    ${posted}
    </div>
    <iframe class="video" src="${videourl}" webkitallowfullscreen mozallowfullscreen allowfullscreen>
    </iframe>
    <p class="item-description">
    ${description}
    </p>
</div>

</#macro>