package com.example.cstore;

public class Item {
    private int itemid;
    private String name;
    // 饰品类型，如武器皮肤、刀、手套等
    private String type;
    // 饰品稀有度，如普通、稀有、传奇等
    private String rarity;
    private String wear;
    private String whosale;


    // 饰品价格
    private double price;

    // 获取饰品名称
    public String getName() {
        return name;
    }

    // 设置饰品名称
    public void setName(String name) {
        this.name = name;
    }

    // 获取饰品类型
    public String getType() {
        return type;
    }

    // 设置饰品类型
    public void setType(String type) {
        this.type = type;
    }

    // 获取饰品稀有度
    public String getRarity() {
        return rarity;
    }

    // 设置饰品稀有度
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    // 获取饰品价格
    public double getPrice() {
        return price;
    }

    // 设置饰品价格
    public void setPrice(double price) {
        this.price = price;
    }

    // 重写 toString 方法，方便打印饰品信息
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rarity='" + rarity + '\'' +
                ", price=" + price +
                '}';
    }
}