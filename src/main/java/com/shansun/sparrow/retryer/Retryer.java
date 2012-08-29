package com.shansun.sparrow.retryer;

import com.google.common.base.Predicate;

/**
 * ����֧��
 * 
 * @author lanbo <br>
 * @version 1.0 <br>
 * @date 2012-8-28
 */
public interface Retryer {

	/**
	 * ��������
	 * 
	 * @param <T>
	 * @param retryableTask
	 * @return
	 * @throws Throwable
	 */
	<T> T executeWithRetry(Retryable<T> retryableTask) throws Throwable;

	/**
	 * ��ȡ���Դ���
	 * 
	 * @return
	 */
	long getTimes();

	/**
	 * ��ȡ���Լ������λ����
	 * 
	 * @return
	 */
	long getInterval();

	/**
	 * ��ȡ�쳣��������
	 * 
	 * @return
	 */
	Predicate<Throwable> getThrowCondition();

	/**
	 * ��ȡ����ֵ��������
	 * 
	 * @return
	 */
	Predicate<Object> getReturnCondition();
}
