package Seminar.Sem6;

public class Award
{
    private Integer place;
    private String contest;

    public Award(Integer place, String contest)
    {
        this.place = place;
        this.contest = contest;
    }

    @Override
    public String toString() {
        return "place= " + place + ", contest= " + contest;
    }
    

    
}
