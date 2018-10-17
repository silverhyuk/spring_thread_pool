package com.silverhyuk.spring_thread_pool.hello;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class HelloVo {
    private  long id;
    private  String content;

    public HelloVo (long id, String content) {
        this.id = id;
        this.content = content;
    }
}
