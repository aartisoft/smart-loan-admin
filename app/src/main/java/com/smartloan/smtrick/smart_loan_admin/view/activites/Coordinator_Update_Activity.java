package com.smartloan.smtrick.smart_loan_admin.view.activites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.smartloan.smtrick.smart_loan_admin.R;
import com.smartloan.smtrick.smart_loan_admin.R;
import com.smartloan.smtrick.smart_loan_admin.callback.CallBack;
import com.smartloan.smtrick.smart_loan_admin.constants.Constant;
import com.smartloan.smtrick.smart_loan_admin.models.LeedsModel;
import com.smartloan.smtrick.smart_loan_admin.preferences.AppSharedPreference;
import com.smartloan.smtrick.smart_loan_admin.repository.LeedRepository;
import com.smartloan.smtrick.smart_loan_admin.repository.impl.LeedRepositoryImpl;
import com.smartloan.smtrick.smart_loan_admin.utilities.Utility;
import com.smartloan.smtrick.smart_loan_admin.view.dialog.ProgressDialogClass;
import java.util.Map;

public class Coordinator_Update_Activity extends AppCompatActivity implements OnItemSelectedListener {
    Spinner CoapplicantRalationship;
    RadioButton REducation;
    RadioButton RYN;
    RadioButton RcoapplicantNO;
    RadioButton RcoapplicantYES;
    Spinner Recidential;
    RadioButton Rfemale;
    RadioButton Rg;
    RadioButton Rgender;
    RadioButton Rmale;
    RadioButton Rno;
    RadioButton Rother;
    RadioButton Rpg;
    RadioButton Rpro;
    RadioButton Rug;
    RadioButton Ryes;
    AppSharedPreference appSharedPreference;
    EditText area;
    Button btcancel;
    Button btupdate;
    Button btverify;
    String cAdharno;
    String cAdress;
    String cAltcontatct;
    String cBank;
    String cBdate;
    String cContatct;
    String cDescreption;
    String cExamount;
    String cIncome;
    String cNmae;
    String cOffaddress;
    String cPadress;
    String cPanno;
    CheckBox chAdhar;
    CheckBox chDL;
    CheckBox chPAN;
    CheckBox chPassport;
    CheckBox chProofAdhar;
    CheckBox chProofCurrentacctStmt;
    CheckBox chProofElectricitybill;
    CheckBox chProofGovtEmpid;
    CheckBox chProofGumasta;
    CheckBox chProofPassport;
    CheckBox chProofRntagmt;
    CheckBox chProofVoterid;
    CheckBox chProofdl;
    CheckBox chVoterID;
    EditText currentarea;
    EditText currentlandmark;
    EditText currentpin;
    EditText currentstreet;
    EditText edtotherrelationship;
    EditText edtreferenceaddress;
    EditText edtreferenceaddress2;
    EditText edtreferencecontactno;
    EditText edtreferencecontactno2;
    EditText edtreferencename;
    EditText edtreferencename2;
    EditText edtreferencerelationship;
    EditText edtreferencerelationship2;
    EditText etaddress;
    EditText etadharno;
    EditText etalternatecontact;
    EditText etbank;
    EditText etbirthdate;
    EditText etcEmail;
    EditText etcname;
    EditText etcontatct;
    EditText etdescription;
    EditText etexammount;
    EditText etgenerated;
    EditText etincome;
    TextView etleednumber;
    EditText etoccupation;
    EditText etoffaddress;
    EditText etother;
    EditText etpanno;
    EditText etpermanantaddress;
    EditText etpropaddress;
    String lGenby;
    EditText landmark;
    LeedRepository leedRepository;
    LeedsModel leedsModel;
    EditText pin;
    ProgressDialogClass progressDialogClass;
    Spinner spinemptype;
    Spinner spinincome;
    Spinner spinloantype;
    String sploantype;
    String spoccupation;
    EditText street;
    TextView txtgeneratedby;
    TextView txtldate;
    TextView txtleadid;
    TextView txtleedtime;
    EditText txtpannumber;

    /* renamed from: com.smartloan.smtrick.smart_loan_admin.view.activites.Coordinator_Update_Activity$1 */
    class C08031 implements OnClickListener {
        C08031() {
        }

        public void onClick(View v) {
            Coordinator_Update_Activity coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cNmae = coordinator_Update_Activity.etcname.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cAdress = coordinator_Update_Activity.etaddress.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cPadress = coordinator_Update_Activity.etpropaddress.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cOffaddress = coordinator_Update_Activity.etoffaddress.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cContatct = coordinator_Update_Activity.etcontatct.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cAltcontatct = coordinator_Update_Activity.etalternatecontact.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cBdate = coordinator_Update_Activity.etbirthdate.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cPanno = coordinator_Update_Activity.etpanno.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cAdharno = coordinator_Update_Activity.etadharno.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cIncome = coordinator_Update_Activity.etincome.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cExamount = coordinator_Update_Activity.etexammount.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cDescreption = coordinator_Update_Activity.etdescription.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.cBank = coordinator_Update_Activity.etbank.getText().toString();
            coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.updateLeadDetails(coordinator_Update_Activity.leedsModel);
            Toast.makeText(Coordinator_Update_Activity.this, "Lead Update Successfully", 0).show();
        }
    }

    /* renamed from: com.smartloan.smtrick.smart_loan_admin.view.activites.Coordinator_Update_Activity$2 */
    class C08042 implements OnClickListener {
        C08042() {
        }

        public void onClick(View v) {
            Coordinator_Update_Activity coordinator_Update_Activity = Coordinator_Update_Activity.this;
            coordinator_Update_Activity.setLeedStatus(coordinator_Update_Activity.leedsModel);
        }
    }

    /* renamed from: com.smartloan.smtrick.smart_loan_admin.view.activites.Coordinator_Update_Activity$3 */
    class C08053 implements OnClickListener {
        C08053() {
        }

        public void onClick(View v) {
            Coordinator_Update_Activity.this.startActivity(new Intent(Coordinator_Update_Activity.this, MainActivity_coordinator.class));
            Coordinator_Update_Activity.this.overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        }
    }

    /* renamed from: com.smartloan.smtrick.smart_loan_admin.view.activites.Coordinator_Update_Activity$4 */
    class C09234 extends CallBack {
        C09234() {
        }

        public void onSuccess(Object object) {
            Toast.makeText(Coordinator_Update_Activity.this, "Lead Submited Successfully", 0).show();
            Coordinator_Update_Activity.this.progressDialogClass.dismissDialog();
        }

        public void onError(Object object) {
            Coordinator_Update_Activity.this.progressDialogClass.dismissDialog();
            Context context = Coordinator_Update_Activity.this;
            Utility.showLongMessage(context, context.getString(R.string.server_error));
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinator_updatelead_activity);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        this.leedsModel = (LeedsModel) getIntent().getSerializableExtra(Constant.LEED_MODEL);
        this.progressDialogClass = new ProgressDialogClass(this);
        this.leedRepository = new LeedRepositoryImpl();
        this.appSharedPreference = new AppSharedPreference(this);
        String[] loanType = new String[]{"HL", "LAP"};
        String[] empType = new String[]{"Salaried", "Businessman"};
        this.spinloantype = (Spinner) findViewById(R.id.sploantype1);
        this.btupdate = (Button) findViewById(R.id.buttonupdate);
        this.btverify = (Button) findViewById(R.id.buttonverify);
        this.btcancel = (Button) findViewById(R.id.buttoncancel);
        this.txtleadid = (TextView) findViewById(R.id.textheader);
        this.etcname = (EditText) findViewById(R.id.txtcamevalue);
        this.etaddress = (EditText) findViewById(R.id.txtcurrentaddressvalue);
        this.etpermanantaddress = (EditText) findViewById(R.id.txtpermenantaddressvalue);
        this.currentpin = (EditText) findViewById(R.id.txtcurrentpin1);
        this.currentlandmark = (EditText) findViewById(R.id.txtcurrentlandmark1);
        this.currentarea = (EditText) findViewById(R.id.txtcurrentarea1);
        this.currentstreet = (EditText) findViewById(R.id.txtcurrentstreet1);
        this.pin = (EditText) findViewById(R.id.txtpin1);
        this.landmark = (EditText) findViewById(R.id.txtlandmark1);
        this.area = (EditText) findViewById(R.id.txtarea1);
        this.street = (EditText) findViewById(R.id.txtstreet1);
        this.etoffaddress = (EditText) findViewById(R.id.txtofficeaddressvalue);
        this.etbirthdate = (EditText) findViewById(R.id.txtbirthdatevalue);
        this.etcontatct = (EditText) findViewById(R.id.txtcontatctvalue);
        this.etalternatecontact = (EditText) findViewById(R.id.edtaltcontact);
        this.etcEmail = (EditText) findViewById(R.id.txtemail1);
        this.Recidential = (Spinner) findViewById(R.id.spinnerrecidencialvalue);
        this.CoapplicantRalationship = (Spinner) findViewById(R.id.txtcoapplicantrelation1);
        this.edtotherrelationship = (EditText) findViewById(R.id.txtotherrelationship1);
        this.edtreferencename = (EditText) findViewById(R.id.txtreferencefullname1);
        this.edtreferenceaddress = (EditText) findViewById(R.id.txtreferenceaddress1);
        this.edtreferencecontactno = (EditText) findViewById(R.id.txtreferencecontactno1);
        this.edtreferencerelationship = (EditText) findViewById(R.id.txtreferencecrelationship1);
        this.edtreferencename2 = (EditText) findViewById(R.id.txtreference2fullname1);
        this.edtreferenceaddress2 = (EditText) findViewById(R.id.txtreference2address1);
        this.edtreferencecontactno2 = (EditText) findViewById(R.id.txtreference2contactno1);
        this.edtreferencerelationship2 = (EditText) findViewById(R.id.txtreferencec2relationship1);
        this.txtpannumber = (EditText) findViewById(R.id.txtpannumber);
        this.etother = (EditText) findViewById(R.id.txtOthervalue);
        this.chAdhar = (CheckBox) findViewById(R.id.checkboxadhar);
        this.chPAN = (CheckBox) findViewById(R.id.checkboxpan);
        this.chVoterID = (CheckBox) findViewById(R.id.checkboxvoterid);
        this.chDL = (CheckBox) findViewById(R.id.checkboxdrivinglicence);
        this.chPassport = (CheckBox) findViewById(R.id.checkboxpassport);
        this.chProofAdhar = (CheckBox) findViewById(R.id.checkboxproofAdhar);
        this.chProofVoterid = (CheckBox) findViewById(R.id.checkboxproofVoterid);
        this.chProofdl = (CheckBox) findViewById(R.id.checkboxproofDL);
        this.chProofElectricitybill = (CheckBox) findViewById(R.id.checkboxproofElectricitybill);
        this.chProofRntagmt = (CheckBox) findViewById(R.id.checkboxpeoofRentAgmt);
        this.chProofPassport = (CheckBox) findViewById(R.id.checkboxproofPassport);
        this.chProofGovtEmpid = (CheckBox) findViewById(R.id.checkboxproofGevtEmpID);
        this.chProofGumasta = (CheckBox) findViewById(R.id.checkboxproofGumasta);
        this.chProofCurrentacctStmt = (CheckBox) findViewById(R.id.checkboxproofCurrentAcctStmt);
        this.RcoapplicantYES = (RadioButton) findViewById(R.id.radioapplicantYes);
        this.RcoapplicantNO = (RadioButton) findViewById(R.id.radioapplicantNo);
        this.Ryes = (RadioButton) findViewById(R.id.radioYes);
        this.Rno = (RadioButton) findViewById(R.id.radioNo);
        this.Rug = (RadioButton) findViewById(R.id.radioUG);
        this.Rg = (RadioButton) findViewById(R.id.radioGraguate);
        this.Rpg = (RadioButton) findViewById(R.id.radioPG);
        this.Rpro = (RadioButton) findViewById(R.id.radioprofessional);
        this.Rother = (RadioButton) findViewById(R.id.radioother);
        this.Rmale = (RadioButton) findViewById(R.id.radioMale);
        this.Rfemale = (RadioButton) findViewById(R.id.radioFemale);
        this.txtldate = (TextView) findViewById(R.id.txtdate1);
        this.txtleadid = (TextView) findViewById(R.id.textheader);
        this.etleednumber = (TextView) findViewById(R.id.txtleadidvalue);
        this.txtleedtime = (TextView) findViewById(R.id.txtleedtime1);
        this.txtgeneratedby = (TextView) findViewById(R.id.txtagentid1);
        ArrayAdapter<String> spinnerArrayAdapterloantype = new ArrayAdapter(this, R.layout.sppinner_layout_listitem, loanType);
        spinnerArrayAdapterloantype.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        this.spinloantype.setAdapter(spinnerArrayAdapterloantype);
        this.spinloantype.setOnItemSelectedListener(this);
        getdata();
        this.btupdate.setOnClickListener(new C08031());
        this.btverify.setOnClickListener(new C08042());
        this.btcancel.setOnClickListener(new C08053());
    }

    private void getdata() {
        try {
            String leednumber;
            String leedid = leedsModel.getLeedId();
            String loantype = leedsModel.getLoanType();
            String agentname = leedsModel.getAgentName();
            String leednumber2 = leedsModel.getLeedNumber();
            Long ldatetime = leedsModel.getCreatedDateTimeLong();
            String sdatetime = Long.toString(ldatetime.longValue());
            String cname = leedsModel.getCustomerName();
            String caddress = leedsModel.getAddress();
            String officeaddress = leedsModel.getofficeAdderess();
            String contact = leedsModel.getMobileNumber();
            String altcontact = leedsModel.getAlternetMobileNumber();
            String birthdate = leedsModel.getDateOfBirth();
            String residencial = leedsModel.getRecidential();
            String permanataddress = leedsModel.getPeraddress();
            String addressYN = leedsModel.getAddressYesNo();
            leedid = leedsModel.getOtherEducation();
            String education = leedsModel.getEducation();
            String birthdate2 = birthdate;
            birthdate = leedsModel.getGender();
            String residencial2 = residencial;
            residencial = leedsModel.getCoApplicantYN();
            String altcontact2 = altcontact;
            altcontact = leedsModel.getCurrentpin();
            String contact2 = contact;
            contact = leedsModel.getCurrentlandmark();
            String officeaddress2 = officeaddress;
            officeaddress = leedsModel.getCurrentarea();
            String permanataddress2 = permanataddress;
            permanataddress = leedsModel.getCurrentstreet();
            String caddress2 = caddress;
            caddress = leedsModel.getPincode();
            String cname2 = cname;
            cname = leedsModel.getLandmark();
            String otherEdu = leedid;
            String Sarea = leedsModel.getArea();
            String Sstreet = leedsModel.getStreet();
            String email = leedsModel.getEmail();
            String adhar = leedsModel.getadharNo();
            String pan = leedsModel.getCheckpanCardNumber();
            String pannumber = leedsModel.getPanCardNumber();
            String voterid = leedsModel.getApvoterid();
            String driverlicence = leedsModel.getApdrivinglicence();
            String passport = leedsModel.getAppassport();
            String adharproof = leedsModel.getProofadhar();
            String voteridproof = leedsModel.getProofvoterid();
            String dlproof = leedsModel.getProofdl();
            String electricitybillproof = leedsModel.getProofelectricitybill();
            String rentagmtproof = leedsModel.getProofrentagmt();
            String passportproof = leedsModel.getProofpassport();
            String gevtidproof = leedsModel.getProofgevtid();
            String gumastaproof = leedsModel.getProofgumasta();
            String currentacctprrof = leedsModel.getProofcurrentacctstmt();
            leedid = leedsModel.getPrapplicantrelation();
            String land = cname;
            cname = leedsModel.getCoapplicantotherrelation();
            String PIN = caddress;
            caddress = leedsModel.getPrreference1name();
            String addressYN2 = addressYN;
            addressYN = leedsModel.getPrreference1address();
            String currentSstreet = permanataddress;
            permanataddress = leedsModel.getPrreferencecontactno();
            String currentSarea = officeaddress;
            officeaddress = leedsModel.getPrreferencerelationship();
            String currentland = contact;
            contact = leedsModel.getPrreference2name();
            String currentPIN = altcontact;
            altcontact = leedsModel.getPrreference2address();
            String gender = birthdate;
            birthdate = leedsModel.getPrreference2contactno();
            String education2 = education;
            String ref2relation = leedsModel.getPrreference2relationship();
            String sEmployed = leedsModel.getEmployed();
            String sCompanytype = leedsModel.getCompanytype();
            String sSalarytype = leedsModel.getSalaytype();
            String sEMIcar = leedsModel.getEmicar();
            String sEMIhome = leedsModel.getEmihome();
            String sEMIsociety = leedsModel.getEmisociety();
            String sEMIpersonal = leedsModel.getEmipersonal();
            String carloanamt = leedsModel.getCarLoanAmount();
            String homeloanamt = leedsModel.getHomeLoanAmount();
            String societyloanamt = leedsModel.getSocietyLoanAmount();
            String personalloanamt = leedsModel.getPersonalLoanAmount();
            String sEMIother = leedsModel.getEmiother();
            String othercompany = leedsModel.getOthercompany();
            String sTenure = leedsModel.getTenure();
            String sExperience = leedsModel.getExperience();
            String sDept = leedsModel.getDepartment();
            String sDesignation = leedsModel.getDesignation();
            String sGross = leedsModel.getGrosssalary();
            String sNet = leedsModel.getNetsalary();
            String sOvertime = leedsModel.getOvertime();
            String sInsentive = leedsModel.getIncentive();
            String sBonus = leedsModel.getBonus();
            String sRentalincom = leedsModel.getRentalincome();
            String sAnnualincome = leedsModel.getAnnualincome();
            String sRental = leedsModel.getRental();
            String sSalrysleep = leedsModel.getSalarysleep();
            String sBankstmt = leedsModel.getBankstmt();
            String sForm = leedsModel.getForm();
            String sAppointmentltr = leedsModel.getAppointmentltr();
            String sConfermationltr = leedsModel.getConformationltr();
            String sExperinceltr = leedsModel.getExperinceltr();
            String sVisa = leedsModel.getVisa();
            String sPassport = leedsModel.getPassport();
            String sEmployerltr = leedsModel.getEmploerltr();
            String sContractltr = leedsModel.getContractltr();
            String sPOA = leedsModel.getPoa();
            String sNREbank = leedsModel.getNrebankstmt();
            String sOverseasebank = leedsModel.getOverseasbankdetail();
            String sITR = leedsModel.getItr();
            String sCurrentbank = leedsModel.getCurrentbankstmt();
            String sSavingbank = leedsModel.getSavingacctstmt();
            String sPartnerdeed = leedsModel.getPartnersheepdeed();
            String sBusinessagmt = leedsModel.getBusinessagmt();
            String sQualification = leedsModel.getQualification();
            String sAgreeincome = leedsModel.getAggrecultureIncome();
            String sotherincome = leedsModel.getOtherIncome();
            String sotherEMIdetails = leedsModel.getEmiOtherDetails();
            String property = leedsModel.getPropety();
            String YN = leedsModel.getPropetyYN();
            String loanrequirement = leedsModel.getExpectedLoanAmount();
            String downpayment = leedsModel.getDownpayment();
            String propertypin = leedsModel.getPrpropertypin();
            String propertylandmark = leedsModel.getPrpropertylandmark();
            String propertyarea = leedsModel.getPrpropertyarea();
            String projectname = leedsModel.getPrprojectname();
            String description = leedsModel.getPrdescripiton();
            String propertytype = leedsModel.getPrpropertytype();
            ArrayAdapter myAdap = (ArrayAdapter) spinloantype.getAdapter();
            int spinnerPosition = myAdap.getPosition(loantype);
            spinloantype.setSelection(spinnerPosition);
            if (leednumber2 != null) {
                txtleadid.setText(leednumber2);
                etleednumber.setText(leednumber2);
            }
            int i;
            if (sdatetime != null) {
                i = spinnerPosition;
                leednumber = leednumber2;
                txtldate.setText(Utility.convertMilliSecondsToFormatedDate(leedsModel.getCreatedDateTimeLong().longValue(), Constant.GLOBAL_DATE_FORMATE));
                txtleedtime.setText(Utility.convertMilliSecondsToFormatedDate(leedsModel.getCreatedDateTimeLong().longValue(), "hh:mm a"));
            } else {
                leednumber = leednumber2;
                i = spinnerPosition;
                String str = sdatetime;
            }
            if (agentname != null) {
                txtgeneratedby.setText(agentname);
            }
            if (residencial != null) {
                if (residencial.equalsIgnoreCase("Yes")) {
                    RcoapplicantYES.setChecked(true);
                } else if (residencial.equalsIgnoreCase("No")) {
                    RcoapplicantNO.setChecked(true);
                }
            }
            if (leedid != null) {
                CoapplicantRalationship.setSelection(((ArrayAdapter) CoapplicantRalationship.getAdapter()).getPosition(leedid));
            }
            if (cname != null) {
                edtotherrelationship.setText(cname);
            }
            if (caddress != null) {
                edtreferencename.setText(caddress);
            }
            if (addressYN != null) {
                edtreferenceaddress.setText(addressYN);
            }
            if (permanataddress != null) {
                edtreferencecontactno.setText(permanataddress);
            }
            if (officeaddress != null) {
                edtreferencerelationship.setText(officeaddress);
            }
            if (contact != null) {
                edtreferencename2.setText(contact);
            }
            if (altcontact != null) {
                edtreferenceaddress2.setText(altcontact);
            }
            if (birthdate != null) {
                edtreferencecontactno2.setText(birthdate);
            }
            if (ref2relation != null) {
                edtreferencerelationship2.setText(ref2relation);
            }
            if (education2 != null) {
                sdatetime = education2;
                if (sdatetime.equalsIgnoreCase("Under Graduate")) {
                    Rug.setChecked(true);
                } else if (sdatetime.equalsIgnoreCase("Graduate")) {
                    Rg.setChecked(true);
                } else if (sdatetime.equalsIgnoreCase("Post Graduate")) {
                    Rpg.setChecked(true);
                } else if (sdatetime.equalsIgnoreCase("Professional")) {
                    Rpro.setChecked(true);
                } else {
                    Rother.setChecked(true);
                }
            }
            if (gender != null) {
                loantype = gender;
                if (loantype.equalsIgnoreCase(Constant.MALE)) {
                    gender = leedid;
                    Rmale.setChecked(true);
                } else {
                    gender = leedid;
                    Rfemale.setChecked(true);
                }
            } else {
                loantype = gender;
            }
            if (currentPIN != null) {
                currentpin.setText(currentPIN);
            }
            if (currentland != null) {
                loantype = currentland;
                currentlandmark.setText(loantype);
            } else {
                loantype = currentland;
            }
            if (currentSarea != null) {
                currentland = loantype;
                loantype = currentSarea;
                currentarea.setText(loantype);
            } else {
                loantype = currentSarea;
            }
            if (currentSstreet != null) {
                currentSarea = loantype;
                loantype = currentSstreet;
                currentstreet.setText(loantype);
            } else {
                loantype = currentSstreet;
            }
            if (addressYN2 != null) {
                currentSstreet = loantype;
                loantype = addressYN2;
                if (loantype.equalsIgnoreCase("Yes")) {
                    addressYN2 = loantype;
                    Ryes.setChecked(true);
                } else {
                    addressYN2 = loantype;
                    Rno.setChecked(true);
                }
            }
            if (Rno.isChecked()) {
                loantype = Sstreet;
            } else {
                if (PIN != null) {
                    loantype = PIN;
                    pin.setText(loantype);
                } else {
                    loantype = PIN;
                }
                if (land != null) {
                    PIN = loantype;
                    loantype = land;
                    landmark.setText(loantype);
                } else {
                    loantype = land;
                }
                if (Sarea != null) {
                    land = loantype;
                    loantype = Sarea;
                    area.setText(loantype);
                } else {
                    loantype = Sarea;
                }
                if (Sstreet != null) {
                    Sarea = loantype;
                    loantype = Sstreet;
                    street.setText(loantype);
                } else {
                    loantype = Sstreet;
                }
            }
            if (adharproof != null) {
                Sstreet = loantype;
                chProofAdhar.setChecked(true);
            }
            if (voteridproof != null) {
                chProofVoterid.setChecked(true);
            }
            if (dlproof != null) {
                chProofdl.setChecked(true);
            }
            if (electricitybillproof != null) {
                chProofElectricitybill.setChecked(true);
            }
            if (rentagmtproof != null) {
                chProofRntagmt.setChecked(true);
            }
            if (passportproof != null) {
                chProofPassport.setChecked(true);
            }
            if (gevtidproof != null) {
                chProofGovtEmpid.setChecked(true);
            }
            if (gumastaproof != null) {
                chProofGumasta.setChecked(true);
            }
            if (currentacctprrof != null) {
                chProofCurrentacctStmt.setChecked(true);
            }
            if (voterid != null) {
                chVoterID.setChecked(true);
            }
            if (driverlicence != null) {
                chDL.setChecked(true);
            }
            if (passport != null) {
                chPassport.setChecked(true);
            }
            if (otherEdu != null) {
                loantype = otherEdu;
                etother.setText(loantype);
            } else {
                loantype = otherEdu;
            }
            if (email != null) {
                otherEdu = loantype;
                loantype = email;
                etcEmail.setText(loantype);
            } else {
                loantype = email;
            }
            if (adhar != null) {
                email = loantype;
                chAdhar.setChecked(true);
            }
            if (pannumber != null) {
                chPAN.setChecked(true);
                loantype = pannumber;
                txtpannumber.setText(loantype);
            } else {
                loantype = pannumber;
            }
            if (leednumber != null) {
                pannumber = loantype;
                loantype = leednumber;
                txtleadid.setText(loantype);
            } else {
                loantype = leednumber;
            }
            if (cname2 != null) {
                leednumber = loantype;
                loantype = cname2;
                etcname.setText(loantype);
            } else {
                loantype = cname2;
            }
            if (caddress2 != null) {
                cname2 = loantype;
                loantype = caddress2;
                etaddress.setText(loantype);
            } else {
                loantype = caddress2;
            }
            if (permanataddress2 != null) {
                caddress2 = loantype;
                loantype = permanataddress2;
                etpermanantaddress.setText(loantype);
            } else {
                loantype = permanataddress2;
            }
            if (officeaddress2 != null) {
                permanataddress2 = loantype;
                loantype = officeaddress2;
                etoffaddress.setText(loantype);
            } else {
                loantype = officeaddress2;
            }
            if (contact2 != null) {
                officeaddress2 = loantype;
                loantype = contact2;
                etcontatct.setText(loantype);
            } else {
                loantype = contact2;
            }
            if (altcontact2 != null) {
                contact2 = loantype;
                loantype = altcontact2;
                etalternatecontact.setText(loantype);
            } else {
                loantype = altcontact2;
            }
            if (residencial2 != null) {
                ArrayAdapter myAdap2 = (ArrayAdapter) Recidential.getAdapter();
                altcontact2 = loantype;
                loantype = residencial2;
                ArrayAdapter residencial3 = myAdap2;
                ref2relation = loantype;
                Recidential.setSelection(myAdap2.getPosition(loantype));
            } else {
                ref2relation = residencial2;
            }
            if (birthdate2 != null) {
                etbirthdate.setText(birthdate2);
            }
        } catch (Exception e) {
        }
    }

    private void setLeedStatus(LeedsModel leedsModel) {
        leedsModel.setStatus(Constant.STATUS_SALES_SUBMITED);
        updateLeed(leedsModel.getLeedId(), leedsModel.getLeedStatusMap1());
    }

    private void updateLeadDetails(LeedsModel leedsModel) {
        leedsModel.setCustomerName(this.cNmae);
        leedsModel.setAddress(this.cAdress);
        leedsModel.setMobileNumber(this.cContatct);
        leedsModel.setDateOfBirth(this.cBdate);
        leedsModel.setPanCardNumber(this.cPanno);
        leedsModel.setLoanType(this.sploantype);
        leedsModel.setOccupation(this.spoccupation);
        leedsModel.setExpectedLoanAmount(this.cExamount);
        leedsModel.setLoanType(this.cAdress);
        leedsModel.setBankName(this.cBank);
        updateLeed(leedsModel.getLeedId(), leedsModel.getLeedStatusMap());
    }

    private void updateLeed(String leedId, Map leedsMap) {
        this.progressDialogClass.showDialog(getString(R.string.loading), getString(R.string.PLEASE_WAIT));
        this.leedRepository.updateLeed(leedId, leedsMap, new C09234());
    }

    public void onItemSelected(AdapterView<?> adapterView, View arg1, int position, long id) {
        this.sploantype = this.spinloantype.getSelectedItem().toString();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}