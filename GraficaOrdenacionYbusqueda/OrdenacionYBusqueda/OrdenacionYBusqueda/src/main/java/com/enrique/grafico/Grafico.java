

/**
 * 
 *
 * @author Enrique Collado
 * 
 */
package com.enrique.grafico;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class Grafico {
    public static void Grafico() {
        try {
            DefaultXYDataset dataset = new DefaultXYDataset();
            dataset.addSeries("BubleSort", new double[][]{{10, 100, 1000, 10000}, {8000, 121000, 3687400, 133924300}});
            dataset.addSeries("SelectSort", new double[][]{{10, 100, 1000, 10000}, {15600, 76600, 2615900, 28644100}});
            dataset.addSeries("InsercciónDirecta", new double[][]{{10, 100, 1000, 10000}, {13900, 44800, 1737600, 38137200}});
            dataset.addSeries("MergeSort", new double[][]{{10, 100, 1000, 10000}, {24000, 92200, 4418700, 136136100}});
            dataset.addSeries("QuickSort", new double[][]{{10, 100, 1000, 10000}, {38100, 21900, 289900, 1189100}});
            XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
            renderer.setSeriesPaint(0, Color.ORANGE);
            renderer.setSeriesPaint(1, Color.BLUE);
            renderer.setSeriesPaint(2, Color.GREEN);
            renderer.setSeriesPaint(3, Color.RED);
            renderer.setSeriesPaint(4, Color.YELLOW);
            renderer.setSeriesStroke(0, new BasicStroke(2));
            renderer.setSeriesStroke(1, new BasicStroke(2));
            renderer.setSeriesStroke(2, new BasicStroke(2));
            renderer.setSeriesStroke(3, new BasicStroke(2));
            renderer.setSeriesStroke(4, new BasicStroke(2));
            JFreeChart chart = ChartFactory.createXYLineChart("Grafico Prueba Aleatorio", "Tamaños", "Tiempos de ejecución", dataset);
            chart.getXYPlot().getRangeAxis();
            ((NumberAxis) chart.getXYPlot().getRangeAxis()).setNumberFormatOverride(new DecimalFormat("#''"));
            chart.getXYPlot().setRenderer(renderer);
            BufferedImage image = chart.createBufferedImage(600, 400);
            ImageIO.write(image, "png", new File("Grafico-Prueba-Aleatorio.png"));

            DefaultXYDataset dataset1 = new DefaultXYDataset();
            dataset1.addSeries("BubleSort", new double[][]{{10, 100, 1000, 10000}, {1300, 71300, 1025700, 23079500}});
            dataset1.addSeries("SelectSort", new double[][]{{10, 100, 1000, 10000}, {1400, 73700, 1489600, 26273200}});
            dataset1.addSeries("InsercciónDirecta", new double[][]{{10, 100, 1000, 10000}, {700, 2900, 6900, 14900}});
            dataset1.addSeries("MergeSort", new double[][]{{10, 100, 1000, 10000}, {3100, 77500, 7452600, 227834600}});
            dataset1.addSeries("QuickSort", new double[][]{{10, 100, 1000, 10000}, {2100, 68400, 1603400, 34202600}});
            XYLineAndShapeRenderer renderer1 = new XYLineAndShapeRenderer();
            renderer1.setSeriesPaint(0, Color.ORANGE);
            renderer1.setSeriesPaint(1, Color.BLUE);
            renderer1.setSeriesPaint(2, Color.GREEN);
            renderer1.setSeriesPaint(3, Color.RED);
            renderer1.setSeriesPaint(4, Color.YELLOW);
            renderer1.setSeriesStroke(0, new BasicStroke(2));
            renderer1.setSeriesStroke(1, new BasicStroke(2));
            renderer1.setSeriesStroke(2, new BasicStroke(2));
            renderer1.setSeriesStroke(3, new BasicStroke(2));
            renderer1.setSeriesStroke(4, new BasicStroke(2));
            JFreeChart chart1 = ChartFactory.createXYLineChart("Grafico Prueba Ordenado", "Tamaños", "Tiempos de ejecución", dataset1);
            chart1.getXYPlot().getRangeAxis();
            ((NumberAxis) chart1.getXYPlot().getRangeAxis()).setNumberFormatOverride(new DecimalFormat("#''"));
            chart1.getXYPlot().setRenderer(renderer1);
            BufferedImage image1 = chart1.createBufferedImage(600, 400);
            ImageIO.write(image1, "png", new File("Grafico-Prueba-Ordenado.png"));

            DefaultXYDataset dataset2 = new DefaultXYDataset();
            dataset2.addSeries("BubleSort", new double[][]{{10, 100, 1000, 10000}, {1900, 135400, 1991600, 31038900}});
            dataset2.addSeries("SelectSort", new double[][]{{10, 100, 1000, 10000}, {1500, 72200, 1527500, 37105100}});
            dataset2.addSeries("InsercciónDirecta", new double[][]{{10, 100, 1000, 10000}, {1400, 90500, 2114200, 17860900}});
            dataset2.addSeries("MergeSort", new double[][]{{10, 100, 1000, 10000}, {3300, 133300, 1284500, 92510700}});
            dataset2.addSeries("QuickSort", new double[][]{{10, 100, 1000, 10000}, {2000, 75400, 1479500, 20625500}});
            XYLineAndShapeRenderer renderer2 = new XYLineAndShapeRenderer();
            renderer2.setSeriesPaint(0, Color.ORANGE);
            renderer2.setSeriesPaint(1, Color.BLUE);
            renderer2.setSeriesPaint(2, Color.GREEN);
            renderer2.setSeriesPaint(3, Color.RED);
            renderer2.setSeriesPaint(4, Color.YELLOW);
            renderer2.setSeriesStroke(0, new BasicStroke(2));
            renderer2.setSeriesStroke(1, new BasicStroke(2));
            renderer2.setSeriesStroke(2, new BasicStroke(2));
            renderer2.setSeriesStroke(3, new BasicStroke(2));
            renderer2.setSeriesStroke(4, new BasicStroke(2));
            JFreeChart chart2 = ChartFactory.createXYLineChart("Grafico Prueba Inverso", "Tamaños", "Tiempos de ejecución", dataset2);
            chart2.getXYPlot().getRangeAxis();
            ((NumberAxis) chart2.getXYPlot().getRangeAxis()).setNumberFormatOverride(new DecimalFormat("#''"));
            chart2.getXYPlot().setRenderer(renderer2);
            BufferedImage image2 = chart2.createBufferedImage(600, 400);
            ImageIO.write(image2, "png", new File("Grafico-Prueba-Inverso.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
