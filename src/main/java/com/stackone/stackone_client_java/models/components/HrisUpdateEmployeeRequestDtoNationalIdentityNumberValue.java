/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue - The type of the national identity number
 */
public enum HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue {
    SSN("ssn"),
    NIN("nin"),
    SIN("sin"),
    NID("nid"),
    PIN("pin"),
    PN("pn"),
    UMCN("umcn"),
    PIC("pic"),
    RIC("ric"),
    IDNUM("idnum"),
    CID("cid"),
    NIDNR("nidnr"),
    PAN("pan"),
    AADHAAR("aadhaar"),
    EPIC("epic"),
    PTN("ptn"),
    ITIN("itin"),
    TIN("tin"),
    UPRC("uprc"),
    PCODE("pcode"),
    SSI("ssi"),
    CEDULA("cedula"),
    PASSPORT("passport"),
    VOTERID("voterid"),
    NTIN("ntin"),
    BN("bn"),
    FNR("fnr"),
    MVA("mva"),
    CIVIL_ID("civil_id"),
    CNIC("cnic"),
    NRIC("nric"),
    FIN("fin"),
    UEN("uen"),
    REGISTRATIONNUMBER("registrationnumber"),
    NIC("nic"),
    PERSONNUMMER("personnummer"),
    AHV("ahv"),
    ID("id"),
    EID("eid"),
    VA("va"),
    PID("pid"),
    NRT("nrt"),
    NIPT("nipt"),
    CBU("cbu"),
    CUIT("cuit"),
    DNI("dni"),
    BUSINESSID("businessid"),
    VNR("vnr"),
    ABN("abn"),
    ACN("acn"),
    TFN("tfn"),
    JMBG("jmbg"),
    BIS("bis"),
    INSZ("insz"),
    NN("nn"),
    EGN("egn"),
    PNF("pnf"),
    VAT("vat"),
    CNPJ("cnpj"),
    UNP("unp"),
    GST("gst"),
    PST("pst"),
    QST("qst"),
    NI("ni"),
    DIC("dic"),
    RC("rc"),
    UID("uid"),
    RUT("rut"),
    USCC("uscc"),
    CPF("cpf"),
    CPJ("cpj"),
    CR("cr"),
    STNR("stnr"),
    SVNR("svnr"),
    NCF("ncf"),
    RNC("rnc"),
    NIF("nif"),
    CI("ci"),
    IK("ik"),
    KMKR("kmkr"),
    REGISTRIKOOD("registrikood"),
    TN("tn"),
    RUC("ruc"),
    NIT("nit"),
    ALV("alv"),
    HETU("hetu"),
    YTUNNUS("ytunnus"),
    VN("vn"),
    UTR("utr"),
    NIFP("nifp"),
    AMKA("amka"),
    CUI("cui"),
    NIR("nir"),
    SIREN("siren"),
    SIRET("siret"),
    TVA("tva"),
    OIB("oib"),
    HKID("hkid"),
    ANUM("anum"),
    KENNITALA("kennitala"),
    VSK("vsk"),
    NPWP("npwp"),
    PPS("pps"),
    GSTIN("gstin"),
    IDNR("idnr"),
    HR("hr"),
    AIC("aic"),
    CODICEFISCALE("codicefiscale"),
    IVA("iva"),
    PEID("peid"),
    ASMENS("asmens"),
    PVM("pvm"),
    CTPS("ctps"),
    VRN("vrn"),
    VTK("vtk"),
    INT("int"),
    TK("tk"),
    PAS("pas"),
    RNE("rne"),
    RG("rg"),
    NCI("nci"),
    CRNM("crnm"),
    PIS("pis"),
    INSEE("insee"),
    TAX("tax"),
    MPF("mpf"),
    EPFO("epfo"),
    ESI("esi"),
    PRAN("pran"),
    UAN("uan"),
    IDK("idk"),
    BSN("bsn"),
    MID("mid"),
    SSS("sss"),
    NIE("nie"),
    NSS("nss"),
    ARC("arc"),
    CURP("curp"),
    IMSS("imss"),
    RFC("rfc"),
    EIN("ein"),
    OTHER("other"),
    UNKNOWN("unknown");

    @JsonValue
    private final String value;

    private HrisUpdateEmployeeRequestDtoNationalIdentityNumberValue(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
