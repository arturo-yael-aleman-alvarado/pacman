import greenfoot.*;  

public class PacmanWorld extends World
{
    
    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;
 
    public PacmanWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,400,1); 
        prepare();
    }
 
    private void prepare()
    {
        Wall wall = new Wall();

        for(int x = 50; x < 550; x+= WIDTH_WALL){
            wall = new Wall();
            addObject(wall,x,30);
            wall = new Wall();
            addObject(wall,x,350);
        }

        for(int y = 58; y < 200; y+= HEIGHT_WALL){
            wall = new Wall();
            addObject(wall,50,y);
            wall = new Wall();
            addObject(wall,526,y);
        }

        Banana banana = new Banana();
        addObject(banana,157,260);
        Cherry cherry = new Cherry();
        addObject(cherry,419,82);
        Stromberry stromberry = new Stromberry();
        addObject(stromberry,284,101);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,376,241);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,270,176);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,260,287);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,354,311);
        Cherry cherry3 = new Cherry();
        addObject(cherry3,59,289);
        Stromberry stromberry2 = new Stromberry();
        addObject(stromberry2,455,303);
        BigBall bigBall = new BigBall();
        addObject(bigBall,468,228);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,337,144);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,165,311);
        BigBall bigBall4 = new BigBall();
        addObject(bigBall4,94,237);
        BigBall bigBall5 = new BigBall();
        addObject(bigBall5,162,148);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,483,79);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,78,172);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,424,167);
        SmallBall smallBall7 = new SmallBall();
        addObject(smallBall7,218,70);
        SmallBall smallBall8 = new SmallBall();
        addObject(smallBall8,200,217);
        SmallBall smallBall9 = new SmallBall();
        addObject(smallBall9,350,66);
        SmallBall smallBall10 = new SmallBall();
        addObject(smallBall10,482,150);
        SmallBall smallBall11 = new SmallBall();
        addObject(smallBall11,112,306);
        SmallBall smallBall12 = new SmallBall();
        addObject(smallBall12,296,227);
        Ballon ballon = new Ballon();
        addObject(ballon,370,195);

        PacmanHud hud = new PacmanHud();
        addObject(hud,0,0);

        Pacman pacman = new Pacman(hud);
        addObject(pacman,110,90);
    }
}
