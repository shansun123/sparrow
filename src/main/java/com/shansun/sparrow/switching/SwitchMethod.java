package com.shansun.sparrow.switching;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ��ǿ��أ�ֻ�����Ǿ�̬����
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-8-1
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SwitchMethod {
	String description();
}