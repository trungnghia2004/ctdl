package hw7_22001624_latrungnghia.ex2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.Random;

public class Test extends Application{
    public static void main(String[] args) {
       launch(args);

    }

    public void start(Stage stage) {
        Random random = new Random();
        stage.setTitle("Line Chart");
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of elements");
        yAxis.setLabel("Time");
        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Comparison chart");
        XYChart.Series isSequentialSearch = new XYChart.Series();
        isSequentialSearch.setName("SequentialSearch");
        XYChart.Series isBinarySearch = new XYChart.Series();
        isBinarySearch.setName("BinarySearch");
        XYChart.Series isBSTSearch = new XYChart.Series();
        isBSTSearch.setName("BSTSearch");
        for (int i = 10^6; i <= Math.pow(10,8); i *= 10) {
            int[] arr = new int[i];
            SequentialSearch sequentialSearch = new SequentialSearch();
            BinarySearch binarySearch = new BinarySearch();
            BST bst = new BST();
            bst.root = bst.insert(bst.root, random.nextInt((int) Math.pow(10, 8)) + 1);
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    arr[j] = random.nextInt((int) Math.pow(10, 8)) + 1;
                } else {
                    arr[j] = random.nextInt((int) Math.pow(10, 8)) + 1;
                    bst.insert(bst.root, random.nextInt((int) Math.pow(10, 8)) + 1);
                }
            }
            int x = random.nextInt((int) Math.pow(10, 8)) + 1;
            sequentialSearch.search(arr, x);
            bst.isSearch(x);
            binarySearch.search(arr, x);
            isSequentialSearch.getData().add(new XYChart.Data(i, sequentialSearch.executionTime));
            isBSTSearch.getData().add(new XYChart.Data(i, bst.executionTime));
           isBinarySearch.getData().add(new XYChart.Data(i, binarySearch.executionTime));
        }
        Scene scene = new Scene(lineChart, 900, 700);
        lineChart.getData().addAll(isSequentialSearch,isBinarySearch,isBSTSearch);
        stage.setScene(scene);
        stage.show();
    }

}
