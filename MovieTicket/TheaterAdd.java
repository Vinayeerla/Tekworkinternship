class TheaterAdd
  {
    String location;
    String theaterName;
    String theaterType;
    String noOfScreen;
    String contactNumber;

    public TheaterAdd(String location, String theaterName, String theaterType, String noOfScreen, String contactNumber) {
		super();
		this.location = location;
		this.theaterName = theaterName;
		this.theaterType = theaterType;
		this.noOfScreen = noOfScreen;
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public String getTheaterType() {
		return theaterType;
	}
	public String getNoOfScreen() {
		return noOfScreen;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	@Override
	public String toString() {
		return "Theater Info [location=" + location + ", theaterName=" + theaterName + ", theaterType=" + theaterType
				+ ", noOfScreen=" + noOfScreen + ", contactNumber=" + contactNumber + "]";
	}
  }