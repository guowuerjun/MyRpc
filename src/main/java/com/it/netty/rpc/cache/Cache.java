package com.it.netty.rpc.cache;

public interface Cache <K,V> {
		 V getCache(K k);
		 void addCache(K k,V v);
}
