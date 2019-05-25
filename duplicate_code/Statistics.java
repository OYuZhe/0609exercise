package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        average1 = avg(array1)
		average2 = avg(array2)

        return Math.abs(average1 - average2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        average1 = avg(elements)
        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);
	public double avg(double[] array)
	{
		double sum = 0;
        double average;

        for (double element : array) {
            sum += element;
        }
        average = sum / array.length;
		return average
		
	}
    }
}