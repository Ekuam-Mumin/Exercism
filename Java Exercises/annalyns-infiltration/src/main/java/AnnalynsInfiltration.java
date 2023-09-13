class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) 
    {
        if(knightIsAwake) return false;
        return true;
        // else throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) 
    {
        boolean isAwake[] = {knightIsAwake, archerIsAwake, prisonerIsAwake};
        int trueCount = 0;
        for(int i = 0; i < isAwake.length; i++)
        {
            if(isAwake[i] == true) trueCount++;
        }
        if(trueCount > 0) return true;
        return false;
        // else throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) 
    {
        if(!archerIsAwake && prisonerIsAwake) return true;
        return false;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) 
    {
        if(petDogIsPresent)
        {
            if(!archerIsAwake) return true;
        }
        else
        {
            if(prisonerIsAwake && (!knightIsAwake && !archerIsAwake)) return true;
        }
        return false;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
