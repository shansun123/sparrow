package com.shansun.sparrow.filter;

/**
 * ���ȼ���ʶ
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-8-22
 */
public interface Ordered {

	/** ������ȼ� */
	int	HIGHEST_PRECEDENCE	= Integer.MIN_VALUE;

	/** ������ȼ� */
	int	LOWEST_PRECEDENCE	= Integer.MAX_VALUE;

	/** �������ȼ���ֵԽС�����ȼ�Խ�� */
	int getOrder();
}
