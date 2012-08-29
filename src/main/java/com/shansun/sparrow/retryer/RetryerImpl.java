package com.shansun.sparrow.retryer;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

/**
 * @author lanbo <br>
 * @version 1.0 <br>
 * @date 2012-8-28
 */
public class RetryerImpl implements Retryer {

	private static final long		DEFAULT_INTERVAL	= 0;
	private static final int		DEFAULT_RETRY_TIMES	= 3;

	/**
	 * ����ʱ��������λΪ���룬Ĭ��Ϊ0
	 */
	private long					interval			= DEFAULT_INTERVAL;

	/**
	 * ���Դ�����Ĭ��Ϊ3
	 */
	private long					times				= DEFAULT_RETRY_TIMES;

	/**
	 * �쳣��������
	 */
	private Predicate<Throwable>	throwCondition		= Predicates.alwaysFalse();

	/**
	 * ����ֵ��������
	 */
	private Predicate<Object>		returnCondition		= Predicates.alwaysFalse();

	@Override
	public <T> T executeWithRetry(Retryable<T> retryableTask) throws Throwable {
		return new RetryableTask<T>(retryableTask, this).execute();
	}

	public long getInterval() {
		return interval;
	}

	public void setInterval(long interval) {
		Preconditions.checkArgument(interval >= 0);
		this.interval = interval;
	}

	public long getTimes() {
		return times;
	}

	public void setTimes(long times) {
		Preconditions.checkArgument(times >= 0);
		this.times = times;
	}

	public Predicate<Throwable> getThrowCondition() {
		return throwCondition;
	}

	public void setThrowCondition(Predicate<Throwable> throwCondition) {
		Preconditions.checkNotNull(throwCondition);
		this.throwCondition = throwCondition;
	}

	public Predicate<Object> getReturnCondition() {
		return returnCondition;
	}

	public void setReturnCondition(Predicate<Object> returnCondition) {
		Preconditions.checkNotNull(returnCondition);
		this.returnCondition = returnCondition;
	}
}
