package hw6_22001624_latrungnghia.ex3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.util.Random;

public class TestEx1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Random random = new Random();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        stage.setTitle("Line Chart");
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of elements");
        yAxis.setLabel("Time");
        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Comparison chart");
        XYChart.Series seriesBubbleSort = new XYChart.Series();
        seriesBubbleSort.setName("BubbleSort");
        XYChart.Series seriesInsertionSort = new XYChart.Series();
        seriesInsertionSort.setName("InsertionSort");
        XYChart.Series seriesSelectionSort = new XYChart.Series();
        seriesSelectionSort.setName("SelectionSort");
        XYChart.Series seriesMergeSort = new XYChart.Series();
        seriesMergeSort.setName("MergeSort");
        XYChart.Series seriesQuickSort = new XYChart.Series();
        seriesQuickSort.setName("QuickSort");
        XYChart.Series seriesHeapSort = new XYChart.Series();
        seriesHeapSort.setName("HeapSort");
        for (int i = 100; i <= 10000; i *= 10) {
            int[] arr = new int[i];
            HeapSort heapSort = new HeapSort<>(i);
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt((int) Math.pow(10, 7)) + 1;
                heapSort.insert(arr[j], arr[j]);
            }
            bubbleSort.bubbleSort(arr);
            selectionSort.selectionSort(arr);
            insertionSort.insertionSort(arr);
            mergeSort.isMergeSort(arr);
            quickSort.isQuickSort(arr);
            heapSort.sort();
            seriesBubbleSort.getData().add(new XYChart.Data(i, bubbleSort.executionTime));
            seriesInsertionSort.getData().add(new XYChart.Data(i, insertionSort.executionTime));
            seriesSelectionSort.getData().add(new XYChart.Data(i, selectionSort.executionTime));
            seriesMergeSort.getData().add(new XYChart.Data(i, mergeSort.executionTime));
            seriesQuickSort.getData().add(new XYChart.Data(i, quickSort.executionTime));
            seriesHeapSort.getData().add(new XYChart.Data(i, heapSort.executionTime));
        }
        Scene scene = new Scene(lineChart, 900, 700);
        lineChart.getData().addAll(seriesBubbleSort, seriesInsertionSort, seriesSelectionSort, seriesMergeSort, seriesQuickSort, seriesHeapSort);
        stage.setScene(scene);
        stage.show();
    }
}