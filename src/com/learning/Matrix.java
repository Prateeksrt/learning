package com.learning;

public class  Matrix {
    private int matrix[][];

    public final int rows;

    public final int columns;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = this.getMatrix()[0].length;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int get(int rowIndex, int columnIndex){
        if(rowIndex >= rows || rowIndex < 1 || columnIndex >= columns || columnIndex <1 )
            throw new ArrayIndexOutOfBoundsException();
        return matrix[rowIndex][columnIndex];
    }

    public void set(int rowIndex, int columnIndex, int value){
        if(rowIndex >= rows || rowIndex < 1 || columnIndex >= columns || columnIndex <1 )
            throw new ArrayIndexOutOfBoundsException();
        matrix[rowIndex][columnIndex] = value;
    }

    public Matrix add(Matrix matrix) throws Exception {
        if(isAddCompatible(matrix)){
            Matrix result = new Matrix(new int[rows][columns]);
            for(int i = 0; i< rows; i++){
                for(int j = 0; j< columns; j++){
                    int sum =  matrix.get(i,j)+this.get(i,j);
                    result.set(i,j,sum);
                }
            }
            return result;
        }
        throw new Exception("Matrices are not compatible for addition");
    }

    public Matrix multiply(Matrix matrix) throws Exception {
        if(isMultiplicationCompatible(matrix)){
            Matrix result = new Matrix(new int[this.rows][matrix.columns]);
            for(int i = 0; i<this.rows; i++){
                for(int j = 0; j<matrix.columns; j++){
                    int product = 0;
                    for(int k=0;k<this.columns;k++){
                         product += this.get(i,k)*matrix.get(j,k);
                    }
                    result.set(i,j,product);
                }
            }
            return result;
        }
        throw new Exception("Matrices are not compatible for multiplication");
    }

    public int getDeterminant() throws Exception {
        if(!isSquareMatrix()){
            throw new Exception("Not a Square matrix");
        }
        return determinant();
    }

    private boolean isSquareMatrix() {
        return this.rows == this.columns;
    }

    private int determinant() {
        if(this.rows == 2){
            return this.get(0,0)*this.get(1,1) - get(0,1)*get(1,0);
        }
        int determinant = 0;
        for(int i = 0 ; i< columns;i++){
            determinant += get(0,1) * subMatrix(i).determinant();
        }
        return determinant;
    }

    private Matrix subMatrix(int columnIndex){
        return subMatrix(0,columnIndex);
    }

    private Matrix subMatrix(int rowIndex, int columnIndex){
        Matrix subMatrix = new Matrix(new int[rows-1][columns-1]);
        for(int i =0, subRow=0; i<rows;i++){
            for(int j=0, subColumn=0 ;j<columns;j++){
                if(i==rowIndex || j==columnIndex){
                    continue;
                }
                subMatrix.set(subRow, subColumn++, get(i,j));
            }
            if(i!=rowIndex){
                subRow++;
            }

        }
        return subMatrix;
    }


    private boolean isMultiplicationCompatible(Matrix matrix) {
        return this.columns == matrix.rows;
    }

    private boolean isAddCompatible(Matrix matrix) {
        return matrix.rows == this.rows && matrix.columns == this.columns;
    }
}
