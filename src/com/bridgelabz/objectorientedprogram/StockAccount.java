package com.bridgelabz.objectorientedprogram;

import java.util.Scanner;
class Stock {

    private String shareName;
    private int numberOfStocks;
    private int shareprice;
    private int numberOfShares;

    public Stock() {
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }

    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfStocks) {
        this.numberOfShares = numberOfShares;
    }

    public int getShareprice() {
        return shareprice;
    }

    public void setShareprice(int shareprice) {
        this.shareprice = shareprice;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "numberOfStocks=" + numberOfStocks +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + shareprice +
                ", shareName='" + shareName + '\'' +
                '}';
    }
}
public class StockAccount extends Stock {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Stock stock = new Stock();

    public static void main(String[] args) {
        System.out.println("Welcome to stock report");
        System.out.println("Enter number of stocks");
        stock.setNumberOfStocks(scanner.nextInt());
        float valueOfStock, totalValueOfStock;
        for (int i = 0; i < stock.getNumberOfStocks(); i++) {
            System.out.println(stockDetails());
            valueOfStock = stock.getNumberOfShares() / stock.getShareprice();
            totalValueOfStock = stock.getNumberOfShares() * stock.getShareprice();
            System.out.println("Each Stock Value of " + stock.getShareName() + " company is " + valueOfStock);
            System.out.println("Total Stock Value of " + stock.getShareName() + " company is " + totalValueOfStock);
        }
}

private static Stock stockDetails() {
        System.out.println("Enter the name of stocks");
        stock.setShareName(scanner.next());
        System.out.println("Enter the number of shares");
        stock.setNumberOfShares(scanner.nextInt());
        System.out.println("Enter the share price");
        stock.setShareprice(scanner.nextInt());
        return stock;
    }
}
