package com.opencsv.bean.Census;



	public class Census {
	    @Census(column = "State", required = true)
	    public String state;

	    @Census(column = "Population", required = true)
	    public int population;

	    @Census(column = "AreaInSqKm", required = true)
	    public int areaInSqKm;

	    @Census(column = "DensityPerSqKm", required = true)
	    public int densityPerSqKm;

	    @Override
	    public String toString() {
	        return "IndiaCensusCSV{" + "State='" + state + '\'' + ", Population='" + population + '\'' + ", AreaInSqKm='" + areaInSqKm + '\'' + ", DensityPerSqKm='" + densityPerSqKm + '\'' + '}';
	    }
	}



