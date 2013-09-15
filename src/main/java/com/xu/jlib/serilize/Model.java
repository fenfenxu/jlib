package com.xu.jlib.serilize;

/**
 * Created with IntelliJ IDEA.
 * User: xuliu
 * Date: 13-9-13
 * Time: 下午9:11
 * To change this template use File | Settings | File Templates.
 */
public class Model {


    @SerialableField(index = 1, type = Type.INT)
    private int anInt;

    @SerialableField(index = 1, type = Type.INT)
    private long aLong;

    @SerialableField(index = 1, type = Type.INT)
    private Integer integer;

    static {
        try {
            Model.class.getField("").getDeclaringClass();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private float aFloat;

    private double aDouble;

    private String string;

    @SerialableField(index = 1, type = Type.INT)
    private Model model;



}
