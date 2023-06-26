class PatientDetails
  {
    String patientName;
    int patientAge;
    String patientGender;
    long patientAadharNo;
    long patientContactNo;
    String patientCity;
    String patientAddress;
    String patientAdmission;
    String patientGuardianName;
    String patientGuardianAddress;
    long patientGuardiancontactNo;

    public PatientDetails(String patientName, int patientAge, String patientGender, long patientAadharNo,
			long patientContactNo, String patientCity, String patientAddress, String patientAdmission,
			String patientGuardianName, String patientGuardianAddress, long patientGuardiancontactNo) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientAadharNo = patientAadharNo;
		this.patientContactNo = patientContactNo;
		this.patientCity = patientCity;
		this.patientAddress = patientAddress;
		this.patientAdmission = patientAdmission;
		this.patientGuardianName = patientGuardianName;
		this.patientGuardianAddress = patientGuardianAddress;
		this.patientGuardiancontactNo = patientGuardiancontactNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public long getPatientAadharNo() {
		return patientAadharNo;
	}
	public long getPatientContactNo() {
		return patientContactNo;
	}
	public String getPatientCity() {
		return patientCity;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public String getPatientAdmission() {
		return patientAdmission;
	}
	public String getPatientGuardianName() {
		return patientGuardianName;
	}
	public String getPatientGuardianAddress() {
		return patientGuardianAddress;
	}
	public long getPatientGuardiancontactNo() {
		return patientGuardiancontactNo;
	}
	@Override
	public String toString() {
		return "Patient Details: [patientName=" + patientName + ", patientAge=" + patientAge + ", patientGender=" + patientGender
				+ ", patientAadharNo=" + patientAadharNo + ", patientContactNo=" + patientContactNo + ", patientCity="
				+ patientCity + ", patientAddress=" + patientAddress + ", patientAdmission=" + patientAdmission
				+ ", patientGuardianName=" + patientGuardianName + ", patientGuardianAddress=" + patientGuardianAddress
				+ ", patientGuardiancontactNo=" + patientGuardiancontactNo + "]";
	}
  }