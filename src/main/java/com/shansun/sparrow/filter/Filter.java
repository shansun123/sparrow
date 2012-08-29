package com.shansun.sparrow.filter;

import com.shansun.sparrow.command.Context;

/**
 * ��������������ҵ����ˣ��������{@link com.taobao.inventory.misc.command.Command}ʹ��
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-8-22
 */
public interface Filter extends Ordered {

	/**
	 * ��ʼ��������
	 */
	void init();

	/**
	 * ִ�й����߼���
	 * 
	 * @param context
	 *            ��������Ҫ֪��������������
	 * @return ��������ж�ʧ�ܣ��򷵻�false�����򷵻�true
	 */
	boolean filter(Context context);

	/**
	 * ���ٹ�����������֮�󣬹����������ٹ��������ܵ���{@link #filter}��Ҳ����������true
	 */
	void destroy();
}
