public class WorldState {
    public void isWorldNegativelyGood(){

        boolean isWorldNegativelyGood = false;

        boolean isWar = true;
        boolean isClimatGood = true;
        boolean isClearWater = true;
        boolean isFinancialCrisis = false;
        boolean isAirGood = true;
        boolean isEpidemy = false;
        boolean aLotOfFood = true;

        isWorldNegativelyGood = isAirGood && isClimatGood && isClearWater && !isEpidemy && aLotOfFood && !isFinancialCrisis && !isWar;

        System.out.println("Мир в хорошем состоянии? " + isWorldNegativelyGood);

    }
}
