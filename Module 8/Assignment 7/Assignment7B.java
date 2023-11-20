import java.util.Scanner;

class Player {
    
    private int width;
    private int height;
    private int depth;
    private int xPos;
    private int yPos;
    private int zPos;

    public Player(int width, int height, int depth, int xPos, int yPos, int zPos) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }

    public int getZ() {
        return zPos;
    }

    public void move_X(int x_delta) {
        this.xPos += x_delta;
    }

    public void move_Y(int y_delta) {
        this.yPos += y_delta;
    }

    public void move_Z(int z_delta) {
        this.zPos += z_delta;
    }

    public boolean didTheyCollide(Player otherPlayer) {
        if (xPos < (otherPlayer.width + otherPlayer.xPos) && (width + xPos) > otherPlayer.xPos 
        && yPos < (otherPlayer.height + otherPlayer.yPos) && (height + yPos) > otherPlayer.yPos 
        && zPos < (otherPlayer.depth + otherPlayer.zPos) && (depth + zPos) > otherPlayer.zPos
        ) {
            return true;
        } else {
            return false;
        }
    }

}

public class Assignment7B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x, y, z, w, h, d;
        Player[] players = new Player[3]; // Need to find alternative for user selection, i.e. (user input "1" should go to Player[0], but for now this will have to do)
        int selected;
        String direction;
        int magnitude;

        System.out.println("[3D Collision Tester]\n");
        for (int i = 1; i < players.length; i++) {
            System.out.println("Create Player "+i);
            System.out.print("Enter X position: ");
            x = input.nextInt();
            System.out.print("Enter Y position: ");
            y = input.nextInt();
            System.out.print("Enter Z position: ");
            z = input.nextInt();
            System.out.print("Enter Player Hitbox Width: ");
            w = input.nextInt();
            System.out.print("Enter Player Hitbox Height: ");
            h = input.nextInt();
            System.out.print("Enter Player Hitbox Depth: ");
            d = input.nextInt();

            players[i] = new Player(w, h, d, x, y, z);

            if (i != players.length-1) {
                System.out.print("\n");
            }
        }    

        do {
            System.out.print("\n");
            for (int j = 1; j < players.length; j++) {
                System.out.print("Player "+j+" is at ("+ players[j].getX() +","+ players[j].getY() +","+ players[j].getZ() +")");
                if (j != players.length-1) {
                    System.out.print(" and ");
                }
            }
            
            System.out.println("\nWhich one do you want to move?");
            selected = input.nextInt();
            input.nextLine();
            System.out.println("Which direction should Player "+selected+" move (up, down, left, right, forward, or backword)?");
            direction = input.nextLine();
            System.out.println("How far should Player "+selected+" move?");
            magnitude = input.nextInt();

            switch (direction.toLowerCase()) {
                case "up":
                    players[selected].move_Y(magnitude);
                    break;

                case "down":
                    players[selected].move_Y(-(magnitude));
                    break;

                case "left":
                    players[selected].move_X(-(magnitude));
                    break;

                case "right":
                    players[selected].move_X(magnitude);
                    break;
                
                case "forward":
                    players[selected].move_Z(magnitude);
                    break;

                case "backward":
                    players[selected].move_Z(-(magnitude));
                    break;
            }

        } while (players[1].didTheyCollide(players[2]) != true);
        
        input.close();
        for (int j = 1; j < players.length; j++) {
            System.out.print("Player "+j+" is at ("+ players[j].getX() +","+ players[j].getY() +","+ players[j].getZ() +")");
            if (j != players.length-1) {
                System.out.print(" and ");
            }
        }
        System.out.print("\nThey collided!");
    }
}
