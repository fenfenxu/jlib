package com.xu.jlib.serilize;

/**
 * Created with IntelliJ IDEA.
 * User: xuliu
 * Date: 13-9-13
 * Time: 下午9:27
 * To change this template use File | Settings | File Templates.
 */
public @interface Serialable {

    public int index();

    public Type type();
}
