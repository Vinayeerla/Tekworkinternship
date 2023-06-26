class BookingDataBase
  {
    String location;
    String theatername;
    String moviename;
    String languge;
    String showdate;
    String showtimingslots;
    String screennumber;
    String categoryseats;
    int ticketPrice;
    int numberoftickets;
    int totalPrice;

    public BookingDataBase(String location, String theatername, String moviename, String languge, String showdate,
			String showtimingslots, String screennumber, String categoryseats, int ticketPrice, int numberoftickets,
			int totalPrice) {
		super();
		this.location = location;
		this.theatername = theatername;
		this.moviename = moviename;
		this.languge = languge;
		this.showdate = showdate;
		this.showtimingslots = showtimingslots;
		this.screennumber = screennumber;
		this.categoryseats = categoryseats;
		this.ticketPrice = ticketPrice;
		this.numberoftickets = numberoftickets;
		this.totalPrice = totalPrice;
	}
	public String getLocation() {
		return location;
	}
	public String getTheatername() {
		return theatername;
	}
	public String getMoviename() {
		return moviename;
	}
	public String getLanguge() {
		return languge;
	}
	public String getShowdate() {
		return showdate;
	}
	public String getShowtimingslots() {
		return showtimingslots;
	}
	public String getScreennumber() {
		return screennumber;
	}
	public String getCategoryseats() {
		return categoryseats;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public int getNumberoftickets() {
		return numberoftickets;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	@Override
	public String toString() {
		return " [location=" + location + ", theatername=" + theatername + ", moviename=" + moviename
				+ ", languge=" + languge + ", showdate=" + showdate + ", showtimingslots=" + showtimingslots
				+ ", screennumber=" + screennumber + ", categoryseats=" + categoryseats + ", ticketPrice=" + ticketPrice
				+ ", numberoftickets=" + numberoftickets + ", totalPrice=" + totalPrice + "]";
	}
  }