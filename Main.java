// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

//create temp

    int[][] temp = new int[100][100];

//copy contents of grid into temp

            for (int row = 0;row<100;row++){
                for(int col = 0; col<100;col++) {


                    temp[col][row] = grid[col][row];
                }
            }

//scan grid and MAKE CHANGES TO TEMP, not grid!

//stop and think about WHY we don't want to change the original grid.

//note: I will only check rows/columns 1-98 so my code won't break when I hit

//end edge!

        for (int row=1; row<99; row++)

    {

        for (int col = 1; col < 99; col++) {

            if (grid[col][row - 1] == 1) { //check above temp[col][row]==1;

                if ( [col][row + 1]==1){ //check below

                    temp[col][row] == 1;
                }

                if (grid[col - 1][row] == 1) {
                    //check to the left

                    temp[col][row] == 1;
                }

                if (grid[col + 1][row] == 1) {
                    //check to the right
                }

            } //col

        } //row
    }

//and finally, make grid equal temp and draw

        grid=temp;

        draw();
}