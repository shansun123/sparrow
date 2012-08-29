package com.shansun.sparrow.cache.api;

/**
 * @author lanbo <br>
 * @version 1.0 <br>
 * @date 2012-8-29
 */
public interface Cache<K, V> {

	/**
	 * ��ȡ����ֵ�����������û�У�ͬ������{$link loader#load}�����ڴ棬�����ؼ��غ������
	 * 
	 * @param key
	 * @param loader
	 * @return
	 */
	V get(K key, CacheLoader<K, V> loader);

	/**
	 * ��ȡ����ֵ�����������û���򷵻�null
	 * 
	 * @param key
	 * @return
	 */
	V getIfPresent(K key);

	/**
	 * ���û���
	 * 
	 * @param key
	 * @param value
	 */
	void put(K key, V value);

	/**
	 * ��key��Ӧ�Ļ���������Ϊ��Ч
	 * 
	 * @param key
	 */
	void invalid(K key);

	/**
	 * ��ȡ����Ѵ�С����Щ��������ܲ�֧��size()��������Tair��
	 * 
	 * @return
	 */
	long size();
}
