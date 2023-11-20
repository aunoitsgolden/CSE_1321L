class BuildingBlueprint {

    private int stories;
    private int units;
    private float occupancy; //representing percentage of occupancy
    private boolean isFull; //represents if the building is 100% full (occupancy == 1)

    public BuildingBlueprint() {
        stories = 10;
        units = 20;
        occupancy = 1.0f;
        isFull = true;
    }

    public BuildingBlueprint(int stories, int units, float occupancy) {
        this.stories = stories;
        this.units = units;
        this.occupancy = occupancy;
    }

    public void setOccupancy(float occupancy) {
        this.occupancy = occupancy;
    }

    public float getOccupancy() {
        return occupancy;
    }

    public int getStories() {
        return stories;
    }

    public int getUnits() {
        return units;
    }

    public boolean isItFull() {
        if (this.occupancy == 1) {
            isFull = true;
        } else {
            isFull = false;
        }
        return isFull;
    }

}

public class Lab13A {
    public static void main(String args[]) {
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, 0.75f);
        
        System.out.println("Year 2020:"
                        +"\nBuilding 1 has "+ buildingOne.getStories() +" floors, "+ buildingOne.getUnits() +" apartments, and is "+ (int)(buildingOne.getOccupancy()*100) +"% occupied. Full? "+ buildingOne.isItFull()
                        +"\nBuilding 2 has "+ buildingTwo.getStories() +" floors, "+ buildingTwo.getUnits() +" apartments, and is "+ (int)(buildingTwo.getOccupancy()*100) +"% occupied. Full? "+ buildingTwo.isItFull());

        System.out.println("\nMany years pass.\n");
        buildingOne.setOccupancy(0);
        buildingTwo.setOccupancy(1);

        System.out.println("Year 2043:"
                        +"\nBuilding 1 has "+ buildingOne.getStories() +" floors, "+ buildingOne.getUnits() +" apartments, and is "+ (int)(buildingOne.getOccupancy()*100) +"% occupied. Full? "+ buildingOne.isItFull()
                        +"\nBuilding 2 has "+ buildingTwo.getStories() +" floors, "+ buildingTwo.getUnits() +" apartments, and is "+ (int)(buildingTwo.getOccupancy()*100) +"% occupied. Full? "+ buildingTwo.isItFull());     
    
        System.out.println("\nLooks like people prefer taller buildings.");
    }
}
