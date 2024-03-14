class TwoD_Array{
    /**
     * @param args
     */
    public static void main(String[] args){
        int X[][] = {{23,45,67,89,32},{34,32,31,43,0}};
       
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print(X[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}