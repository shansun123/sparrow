package com.shansun.sparrow.actor;

import java.util.List;

/**
 * 消息体包装
 * 
 * @author: lanbo <br>
 * @version: 1.0 <br>
 * @date: 2012-7-20
 */
public class MessageWrapper {

	/**
	 * 消息内容
	 */
	private Message			message;

	/**
	 * 消息源
	 */
	private String			source;

	/**
	 * 消息目标
	 */
	private String			target;

	/**
	 * 消息目标列表
	 */
	private List<String>	targets;

	/**
	 * 执行方式：
	 */
	private SpreadMode		mode;

	/**
	 * 传播方式
	 * 
	 * @author: lanbo <br>
	 * @version: 1.0 <br>
	 * @date: 2012-7-21
	 */
	static enum SpreadMode {
		PEER_2_PEER, // 点对点发射
		PEER_2_MULTI, // 点对多点
		BROAD_CAST, // 广播
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public SpreadMode getMode() {
		return mode;
	}

	public void setMode(SpreadMode mode) {
		this.mode = mode;
	}

	public List<String> getTargets() {
		return targets;
	}

	public void setTargets(List<String> targets) {
		this.targets = targets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageWrapper other = (MessageWrapper) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}
}
