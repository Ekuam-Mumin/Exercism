class BirdWatcher 
{
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) 
    {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() 
    {
        return this.birdsPerDay;
    }

    public int getToday() 
    {
        if(this.birdsPerDay.length == 0) return 0;
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() 
    {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() 
    {
        for(int birds : this.birdsPerDay)
        {
            if(birds == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) 
    {
        int count = 0;
        
        if(numberOfDays < 7)
        {
            for(int i = 0; i < numberOfDays; i++)
            {
                count += this.birdsPerDay[i];
            }
        }
        else
        {
            for(int i = 0; i < this.birdsPerDay.length; i++)
            {
                count += this.birdsPerDay[i];
            }
        }
        return count;
    }

    public int getBusyDays() 
    {
        int count = 0;
        for(int i = 0; i < this.birdsPerDay.length; i++)
        {
            count += (this.birdsPerDay[i] >= 5 ? 1 : 0);
        }
        return count;
    }
}
