package com.jeff.home.api.dubbo;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.jeff.home.api.model.TUserVo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @date 2016年8月4日 下午4:12:26
 * @version 1.0
 * @describe 要让Kryo和FST完全发挥出高性能，最好将那些需要被序列化的类注册到dubbo系统中，例如，我们可以实现如下回调接口：
 *           在注册这些类后，序列化的性能可能被大大提升，特别针对小数量的嵌套对象的时候。由于注册被序列化的类仅仅是出于性能优化的目的，
 *           所以即使你忘记注册某些类也没有关系。事实上，即使不注册任何类，Kryo和FST的性能依然普遍优于hessian和dubbo序列化。
 * @author zhouchengzhuo
 * @parameter
 * @return
 */
public class SerializationOptimizerImpl implements  SerializationOptimizer{

	@SuppressWarnings("rawtypes")
	@Override
	public Collection<Class<?>> getSerializableClasses() {
		List<Class<?>> classes = new LinkedList<Class<?>>();
		classes.add(TUserVo.class);
		return classes;
	}

}
