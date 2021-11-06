package com.fqcheng220;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

public class WebMagicDemo {
    public static void main(String args[]){
        Spider.create(new OschinaBlogPageProcesser()).addUrl("https://my.oschina.net/flashsword/blog")
                .addPipeline(new ConsolePipeline()).run();
    }
}
