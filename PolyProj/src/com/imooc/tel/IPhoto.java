package com.imooc.tel;

/**
 * 具有照相能力的借口
 * 
 * @author clj
 *
 */
public interface IPhoto {
	// 具有拍照的能力
	public void photo();

	default void connection() {
		System.out.println("我是IPhoto的connection");
	}
}
