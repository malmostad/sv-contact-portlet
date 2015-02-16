
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ArrayOfCaseInfoBasic;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ArrayOfTempFormBasic;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.CaseInfo;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactInfo;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactInfoInputs;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.DeleteTempFormReply;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.Form;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.FormSavedReply;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.NewCaseReply;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.SignData;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.UploadConstraints;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME = new QName("http://tempuri.org/", "authenticationInfo");
    private final static QName _GetRequestedContactFieldsPrefilledResponseGetRequestedContactFieldsPrefilledResult_QNAME = new QName("http://tempuri.org/", "GetRequestedContactFieldsPrefilledResult");
    private final static QName _GetRegistrationFormResponseGetRegistrationFormResult_QNAME = new QName("http://tempuri.org/", "GetRegistrationFormResult");
    private final static QName _ChangeRegistrationFormResponseChangeRegistrationFormResult_QNAME = new QName("http://tempuri.org/", "ChangeRegistrationFormResult");
    private final static QName _GetCaseAuthInfo_QNAME = new QName("http://tempuri.org/", "authInfo");
    private final static QName _GetRegistrationDraftDraftId_QNAME = new QName("http://tempuri.org/", "draftId");
    private final static QName _RegisterCaseWithContactDetailsForm_QNAME = new QName("http://tempuri.org/", "form");
    private final static QName _RegisterCaseWithContactDetailsContactInfo_QNAME = new QName("http://tempuri.org/", "contactInfo");
    private final static QName _RegisterCaseWithContactDetailsSignData_QNAME = new QName("http://tempuri.org/", "signData");
    private final static QName _GetRequestedContactFieldsResponseGetRequestedContactFieldsResult_QNAME = new QName("http://tempuri.org/", "GetRequestedContactFieldsResult");
    private final static QName _GetUploadConstraintsResponseGetUploadConstraintsResult_QNAME = new QName("http://tempuri.org/", "GetUploadConstraintsResult");
    private final static QName _DeleteRegistrationDraftResponseDeleteRegistrationDraftResult_QNAME = new QName("http://tempuri.org/", "DeleteRegistrationDraftResult");
    private final static QName _RegisterCaseWithHandlerAndContactDetailsHandlerGuid_QNAME = new QName("http://tempuri.org/", "handlerGuid");
    private final static QName _RegisterCaseWithHandlerAndContactDetailsHandlerGroupGuid_QNAME = new QName("http://tempuri.org/", "handlerGroupGuid");
    private final static QName _GetCaseResponseGetCaseResult_QNAME = new QName("http://tempuri.org/", "GetCaseResult");
    private final static QName _GetRegisteredFormResponseGetRegisteredFormResult_QNAME = new QName("http://tempuri.org/", "GetRegisteredFormResult");
    private final static QName _RegisterCaseWithHandlerAndContactDetailsResponseRegisterCaseWithHandlerAndContactDetailsResult_QNAME = new QName("http://tempuri.org/", "RegisterCaseWithHandlerAndContactDetailsResult");
    private final static QName _RegisterCaseWithHandlerResponseRegisterCaseWithHandlerResult_QNAME = new QName("http://tempuri.org/", "RegisterCaseWithHandlerResult");
    private final static QName _RegisterCaseWithContactDetailsResponseRegisterCaseWithContactDetailsResult_QNAME = new QName("http://tempuri.org/", "RegisterCaseWithContactDetailsResult");
    private final static QName _GetRegistrationDraftResponseGetRegistrationDraftResult_QNAME = new QName("http://tempuri.org/", "GetRegistrationDraftResult");
    private final static QName _GetCasesForContactResponseGetCasesForContactResult_QNAME = new QName("http://tempuri.org/", "GetCasesForContactResult");
    private final static QName _GetRegistrationDraftsResponseGetRegistrationDraftsResult_QNAME = new QName("http://tempuri.org/", "GetRegistrationDraftsResult");
    private final static QName _RegisterCaseResponseRegisterCaseResult_QNAME = new QName("http://tempuri.org/", "RegisterCaseResult");
    private final static QName _SaveRegistrationDraftSignText_QNAME = new QName("http://tempuri.org/", "signText");
    private final static QName _GetCasesForContactFromDate_QNAME = new QName("http://tempuri.org/", "fromDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRequestedContactFieldsPrefilled }
     * 
     */
    public GetRequestedContactFieldsPrefilled createGetRequestedContactFieldsPrefilled() {
        return new GetRequestedContactFieldsPrefilled();
    }

    /**
     * Create an instance of {@link GetRequestedContactFieldsPrefilledResponse }
     * 
     */
    public GetRequestedContactFieldsPrefilledResponse createGetRequestedContactFieldsPrefilledResponse() {
        return new GetRequestedContactFieldsPrefilledResponse();
    }

    /**
     * Create an instance of {@link ChangeRegistrationFormResponse }
     * 
     */
    public ChangeRegistrationFormResponse createChangeRegistrationFormResponse() {
        return new ChangeRegistrationFormResponse();
    }

    /**
     * Create an instance of {@link GetRegistrationFormResponse }
     * 
     */
    public GetRegistrationFormResponse createGetRegistrationFormResponse() {
        return new GetRegistrationFormResponse();
    }

    /**
     * Create an instance of {@link GetCase }
     * 
     */
    public GetCase createGetCase() {
        return new GetCase();
    }

    /**
     * Create an instance of {@link GetRegistrationDraft }
     * 
     */
    public GetRegistrationDraft createGetRegistrationDraft() {
        return new GetRegistrationDraft();
    }

    /**
     * Create an instance of {@link RegisterCaseWithContactDetails }
     * 
     */
    public RegisterCaseWithContactDetails createRegisterCaseWithContactDetails() {
        return new RegisterCaseWithContactDetails();
    }

    /**
     * Create an instance of {@link GetRequestedContactFieldsResponse }
     * 
     */
    public GetRequestedContactFieldsResponse createGetRequestedContactFieldsResponse() {
        return new GetRequestedContactFieldsResponse();
    }

    /**
     * Create an instance of {@link GetUploadConstraintsResponse }
     * 
     */
    public GetUploadConstraintsResponse createGetUploadConstraintsResponse() {
        return new GetUploadConstraintsResponse();
    }

    /**
     * Create an instance of {@link DeleteRegistrationDraftResponse }
     * 
     */
    public DeleteRegistrationDraftResponse createDeleteRegistrationDraftResponse() {
        return new DeleteRegistrationDraftResponse();
    }

    /**
     * Create an instance of {@link GetRegisteredForm }
     * 
     */
    public GetRegisteredForm createGetRegisteredForm() {
        return new GetRegisteredForm();
    }

    /**
     * Create an instance of {@link RegisterCaseWithHandlerAndContactDetails }
     * 
     */
    public RegisterCaseWithHandlerAndContactDetails createRegisterCaseWithHandlerAndContactDetails() {
        return new RegisterCaseWithHandlerAndContactDetails();
    }

    /**
     * Create an instance of {@link GetCaseResponse }
     * 
     */
    public GetCaseResponse createGetCaseResponse() {
        return new GetCaseResponse();
    }

    /**
     * Create an instance of {@link SaveRegistrationDraftResponse }
     * 
     */
    public SaveRegistrationDraftResponse createSaveRegistrationDraftResponse() {
        return new SaveRegistrationDraftResponse();
    }

    /**
     * Create an instance of {@link GetRequestedContactFields }
     * 
     */
    public GetRequestedContactFields createGetRequestedContactFields() {
        return new GetRequestedContactFields();
    }

    /**
     * Create an instance of {@link GetRegisteredFormResponse }
     * 
     */
    public GetRegisteredFormResponse createGetRegisteredFormResponse() {
        return new GetRegisteredFormResponse();
    }

    /**
     * Create an instance of {@link ChangeRegistrationForm }
     * 
     */
    public ChangeRegistrationForm createChangeRegistrationForm() {
        return new ChangeRegistrationForm();
    }

    /**
     * Create an instance of {@link RegisterCaseWithHandlerAndContactDetailsResponse }
     * 
     */
    public RegisterCaseWithHandlerAndContactDetailsResponse createRegisterCaseWithHandlerAndContactDetailsResponse() {
        return new RegisterCaseWithHandlerAndContactDetailsResponse();
    }

    /**
     * Create an instance of {@link RegisterCase }
     * 
     */
    public RegisterCase createRegisterCase() {
        return new RegisterCase();
    }

    /**
     * Create an instance of {@link RegisterCaseWithHandlerResponse }
     * 
     */
    public RegisterCaseWithHandlerResponse createRegisterCaseWithHandlerResponse() {
        return new RegisterCaseWithHandlerResponse();
    }

    /**
     * Create an instance of {@link RegisterCaseWithContactDetailsResponse }
     * 
     */
    public RegisterCaseWithContactDetailsResponse createRegisterCaseWithContactDetailsResponse() {
        return new RegisterCaseWithContactDetailsResponse();
    }

    /**
     * Create an instance of {@link GetRegistrationDrafts }
     * 
     */
    public GetRegistrationDrafts createGetRegistrationDrafts() {
        return new GetRegistrationDrafts();
    }

    /**
     * Create an instance of {@link DeleteRegistrationDraft }
     * 
     */
    public DeleteRegistrationDraft createDeleteRegistrationDraft() {
        return new DeleteRegistrationDraft();
    }

    /**
     * Create an instance of {@link GetRegistrationDraftResponse }
     * 
     */
    public GetRegistrationDraftResponse createGetRegistrationDraftResponse() {
        return new GetRegistrationDraftResponse();
    }

    /**
     * Create an instance of {@link GetCasesForContactResponse }
     * 
     */
    public GetCasesForContactResponse createGetCasesForContactResponse() {
        return new GetCasesForContactResponse();
    }

    /**
     * Create an instance of {@link GetRegistrationDraftsResponse }
     * 
     */
    public GetRegistrationDraftsResponse createGetRegistrationDraftsResponse() {
        return new GetRegistrationDraftsResponse();
    }

    /**
     * Create an instance of {@link GetRegistrationForm }
     * 
     */
    public GetRegistrationForm createGetRegistrationForm() {
        return new GetRegistrationForm();
    }

    /**
     * Create an instance of {@link RegisterCaseResponse }
     * 
     */
    public RegisterCaseResponse createRegisterCaseResponse() {
        return new RegisterCaseResponse();
    }

    /**
     * Create an instance of {@link GetUploadConstraints }
     * 
     */
    public GetUploadConstraints createGetUploadConstraints() {
        return new GetUploadConstraints();
    }

    /**
     * Create an instance of {@link SaveRegistrationDraft }
     * 
     */
    public SaveRegistrationDraft createSaveRegistrationDraft() {
        return new SaveRegistrationDraft();
    }

    /**
     * Create an instance of {@link GetCasesForContact }
     * 
     */
    public GetCasesForContact createGetCasesForContact() {
        return new GetCasesForContact();
    }

    /**
     * Create an instance of {@link RegisterCaseWithHandler }
     * 
     */
    public RegisterCaseWithHandler createRegisterCaseWithHandler() {
        return new RegisterCaseWithHandler();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = GetRequestedContactFieldsPrefilled.class)
    public JAXBElement<ContactAuthenticationInfo> createGetRequestedContactFieldsPrefilledAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, GetRequestedContactFieldsPrefilled.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInfoInputs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRequestedContactFieldsPrefilledResult", scope = GetRequestedContactFieldsPrefilledResponse.class)
    public JAXBElement<ContactInfoInputs> createGetRequestedContactFieldsPrefilledResponseGetRequestedContactFieldsPrefilledResult(ContactInfoInputs value) {
        return new JAXBElement<ContactInfoInputs>(_GetRequestedContactFieldsPrefilledResponseGetRequestedContactFieldsPrefilledResult_QNAME, ContactInfoInputs.class, GetRequestedContactFieldsPrefilledResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRegistrationFormResult", scope = GetRegistrationFormResponse.class)
    public JAXBElement<Form> createGetRegistrationFormResponseGetRegistrationFormResult(Form value) {
        return new JAXBElement<Form>(_GetRegistrationFormResponseGetRegistrationFormResult_QNAME, Form.class, GetRegistrationFormResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormSavedReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChangeRegistrationFormResult", scope = ChangeRegistrationFormResponse.class)
    public JAXBElement<FormSavedReply> createChangeRegistrationFormResponseChangeRegistrationFormResult(FormSavedReply value) {
        return new JAXBElement<FormSavedReply>(_ChangeRegistrationFormResponseChangeRegistrationFormResult_QNAME, FormSavedReply.class, ChangeRegistrationFormResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authInfo", scope = GetCase.class)
    public JAXBElement<ContactAuthenticationInfo> createGetCaseAuthInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetCaseAuthInfo_QNAME, ContactAuthenticationInfo.class, GetCase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = GetRegistrationDraft.class)
    public JAXBElement<ContactAuthenticationInfo> createGetRegistrationDraftAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, GetRegistrationDraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "draftId", scope = GetRegistrationDraft.class)
    public JAXBElement<String> createGetRegistrationDraftDraftId(String value) {
        return new JAXBElement<String>(_GetRegistrationDraftDraftId_QNAME, String.class, GetRegistrationDraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "form", scope = RegisterCaseWithContactDetails.class)
    public JAXBElement<Form> createRegisterCaseWithContactDetailsForm(Form value) {
        return new JAXBElement<Form>(_RegisterCaseWithContactDetailsForm_QNAME, Form.class, RegisterCaseWithContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "contactInfo", scope = RegisterCaseWithContactDetails.class)
    public JAXBElement<ContactInfo> createRegisterCaseWithContactDetailsContactInfo(ContactInfo value) {
        return new JAXBElement<ContactInfo>(_RegisterCaseWithContactDetailsContactInfo_QNAME, ContactInfo.class, RegisterCaseWithContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = RegisterCaseWithContactDetails.class)
    public JAXBElement<ContactAuthenticationInfo> createRegisterCaseWithContactDetailsAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, RegisterCaseWithContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signData", scope = RegisterCaseWithContactDetails.class)
    public JAXBElement<SignData> createRegisterCaseWithContactDetailsSignData(SignData value) {
        return new JAXBElement<SignData>(_RegisterCaseWithContactDetailsSignData_QNAME, SignData.class, RegisterCaseWithContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInfoInputs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRequestedContactFieldsResult", scope = GetRequestedContactFieldsResponse.class)
    public JAXBElement<ContactInfoInputs> createGetRequestedContactFieldsResponseGetRequestedContactFieldsResult(ContactInfoInputs value) {
        return new JAXBElement<ContactInfoInputs>(_GetRequestedContactFieldsResponseGetRequestedContactFieldsResult_QNAME, ContactInfoInputs.class, GetRequestedContactFieldsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadConstraints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUploadConstraintsResult", scope = GetUploadConstraintsResponse.class)
    public JAXBElement<UploadConstraints> createGetUploadConstraintsResponseGetUploadConstraintsResult(UploadConstraints value) {
        return new JAXBElement<UploadConstraints>(_GetUploadConstraintsResponseGetUploadConstraintsResult_QNAME, UploadConstraints.class, GetUploadConstraintsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTempFormReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DeleteRegistrationDraftResult", scope = DeleteRegistrationDraftResponse.class)
    public JAXBElement<DeleteTempFormReply> createDeleteRegistrationDraftResponseDeleteRegistrationDraftResult(DeleteTempFormReply value) {
        return new JAXBElement<DeleteTempFormReply>(_DeleteRegistrationDraftResponseDeleteRegistrationDraftResult_QNAME, DeleteTempFormReply.class, DeleteRegistrationDraftResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = GetRegisteredForm.class)
    public JAXBElement<ContactAuthenticationInfo> createGetRegisteredFormAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, GetRegisteredForm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "form", scope = RegisterCaseWithHandlerAndContactDetails.class)
    public JAXBElement<Form> createRegisterCaseWithHandlerAndContactDetailsForm(Form value) {
        return new JAXBElement<Form>(_RegisterCaseWithContactDetailsForm_QNAME, Form.class, RegisterCaseWithHandlerAndContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "contactInfo", scope = RegisterCaseWithHandlerAndContactDetails.class)
    public JAXBElement<ContactInfo> createRegisterCaseWithHandlerAndContactDetailsContactInfo(ContactInfo value) {
        return new JAXBElement<ContactInfo>(_RegisterCaseWithContactDetailsContactInfo_QNAME, ContactInfo.class, RegisterCaseWithHandlerAndContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = RegisterCaseWithHandlerAndContactDetails.class)
    public JAXBElement<ContactAuthenticationInfo> createRegisterCaseWithHandlerAndContactDetailsAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, RegisterCaseWithHandlerAndContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "handlerGuid", scope = RegisterCaseWithHandlerAndContactDetails.class)
    public JAXBElement<String> createRegisterCaseWithHandlerAndContactDetailsHandlerGuid(String value) {
        return new JAXBElement<String>(_RegisterCaseWithHandlerAndContactDetailsHandlerGuid_QNAME, String.class, RegisterCaseWithHandlerAndContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signData", scope = RegisterCaseWithHandlerAndContactDetails.class)
    public JAXBElement<SignData> createRegisterCaseWithHandlerAndContactDetailsSignData(SignData value) {
        return new JAXBElement<SignData>(_RegisterCaseWithContactDetailsSignData_QNAME, SignData.class, RegisterCaseWithHandlerAndContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "handlerGroupGuid", scope = RegisterCaseWithHandlerAndContactDetails.class)
    public JAXBElement<String> createRegisterCaseWithHandlerAndContactDetailsHandlerGroupGuid(String value) {
        return new JAXBElement<String>(_RegisterCaseWithHandlerAndContactDetailsHandlerGroupGuid_QNAME, String.class, RegisterCaseWithHandlerAndContactDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCaseResult", scope = GetCaseResponse.class)
    public JAXBElement<CaseInfo> createGetCaseResponseGetCaseResult(CaseInfo value) {
        return new JAXBElement<CaseInfo>(_GetCaseResponseGetCaseResult_QNAME, CaseInfo.class, GetCaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRegisteredFormResult", scope = GetRegisteredFormResponse.class)
    public JAXBElement<Form> createGetRegisteredFormResponseGetRegisteredFormResult(Form value) {
        return new JAXBElement<Form>(_GetRegisteredFormResponseGetRegisteredFormResult_QNAME, Form.class, GetRegisteredFormResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCaseReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterCaseWithHandlerAndContactDetailsResult", scope = RegisterCaseWithHandlerAndContactDetailsResponse.class)
    public JAXBElement<NewCaseReply> createRegisterCaseWithHandlerAndContactDetailsResponseRegisterCaseWithHandlerAndContactDetailsResult(NewCaseReply value) {
        return new JAXBElement<NewCaseReply>(_RegisterCaseWithHandlerAndContactDetailsResponseRegisterCaseWithHandlerAndContactDetailsResult_QNAME, NewCaseReply.class, RegisterCaseWithHandlerAndContactDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "form", scope = ChangeRegistrationForm.class)
    public JAXBElement<Form> createChangeRegistrationFormForm(Form value) {
        return new JAXBElement<Form>(_RegisterCaseWithContactDetailsForm_QNAME, Form.class, ChangeRegistrationForm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = ChangeRegistrationForm.class)
    public JAXBElement<ContactAuthenticationInfo> createChangeRegistrationFormAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, ChangeRegistrationForm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signData", scope = ChangeRegistrationForm.class)
    public JAXBElement<SignData> createChangeRegistrationFormSignData(SignData value) {
        return new JAXBElement<SignData>(_RegisterCaseWithContactDetailsSignData_QNAME, SignData.class, ChangeRegistrationForm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "form", scope = RegisterCase.class)
    public JAXBElement<Form> createRegisterCaseForm(Form value) {
        return new JAXBElement<Form>(_RegisterCaseWithContactDetailsForm_QNAME, Form.class, RegisterCase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = RegisterCase.class)
    public JAXBElement<ContactAuthenticationInfo> createRegisterCaseAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, RegisterCase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signData", scope = RegisterCase.class)
    public JAXBElement<SignData> createRegisterCaseSignData(SignData value) {
        return new JAXBElement<SignData>(_RegisterCaseWithContactDetailsSignData_QNAME, SignData.class, RegisterCase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCaseReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterCaseWithHandlerResult", scope = RegisterCaseWithHandlerResponse.class)
    public JAXBElement<NewCaseReply> createRegisterCaseWithHandlerResponseRegisterCaseWithHandlerResult(NewCaseReply value) {
        return new JAXBElement<NewCaseReply>(_RegisterCaseWithHandlerResponseRegisterCaseWithHandlerResult_QNAME, NewCaseReply.class, RegisterCaseWithHandlerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCaseReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterCaseWithContactDetailsResult", scope = RegisterCaseWithContactDetailsResponse.class)
    public JAXBElement<NewCaseReply> createRegisterCaseWithContactDetailsResponseRegisterCaseWithContactDetailsResult(NewCaseReply value) {
        return new JAXBElement<NewCaseReply>(_RegisterCaseWithContactDetailsResponseRegisterCaseWithContactDetailsResult_QNAME, NewCaseReply.class, RegisterCaseWithContactDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = GetRegistrationDrafts.class)
    public JAXBElement<ContactAuthenticationInfo> createGetRegistrationDraftsAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, GetRegistrationDrafts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = DeleteRegistrationDraft.class)
    public JAXBElement<ContactAuthenticationInfo> createDeleteRegistrationDraftAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, DeleteRegistrationDraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "draftId", scope = DeleteRegistrationDraft.class)
    public JAXBElement<String> createDeleteRegistrationDraftDraftId(String value) {
        return new JAXBElement<String>(_GetRegistrationDraftDraftId_QNAME, String.class, DeleteRegistrationDraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRegistrationDraftResult", scope = GetRegistrationDraftResponse.class)
    public JAXBElement<Form> createGetRegistrationDraftResponseGetRegistrationDraftResult(Form value) {
        return new JAXBElement<Form>(_GetRegistrationDraftResponseGetRegistrationDraftResult_QNAME, Form.class, GetRegistrationDraftResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseInfoBasic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCasesForContactResult", scope = GetCasesForContactResponse.class)
    public JAXBElement<ArrayOfCaseInfoBasic> createGetCasesForContactResponseGetCasesForContactResult(ArrayOfCaseInfoBasic value) {
        return new JAXBElement<ArrayOfCaseInfoBasic>(_GetCasesForContactResponseGetCasesForContactResult_QNAME, ArrayOfCaseInfoBasic.class, GetCasesForContactResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTempFormBasic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRegistrationDraftsResult", scope = GetRegistrationDraftsResponse.class)
    public JAXBElement<ArrayOfTempFormBasic> createGetRegistrationDraftsResponseGetRegistrationDraftsResult(ArrayOfTempFormBasic value) {
        return new JAXBElement<ArrayOfTempFormBasic>(_GetRegistrationDraftsResponseGetRegistrationDraftsResult_QNAME, ArrayOfTempFormBasic.class, GetRegistrationDraftsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = GetRegistrationForm.class)
    public JAXBElement<ContactAuthenticationInfo> createGetRegistrationFormAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, GetRegistrationForm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCaseReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterCaseResult", scope = RegisterCaseResponse.class)
    public JAXBElement<NewCaseReply> createRegisterCaseResponseRegisterCaseResult(NewCaseReply value) {
        return new JAXBElement<NewCaseReply>(_RegisterCaseResponseRegisterCaseResult_QNAME, NewCaseReply.class, RegisterCaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "form", scope = SaveRegistrationDraft.class)
    public JAXBElement<Form> createSaveRegistrationDraftForm(Form value) {
        return new JAXBElement<Form>(_RegisterCaseWithContactDetailsForm_QNAME, Form.class, SaveRegistrationDraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = SaveRegistrationDraft.class)
    public JAXBElement<ContactAuthenticationInfo> createSaveRegistrationDraftAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, SaveRegistrationDraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signText", scope = SaveRegistrationDraft.class)
    public JAXBElement<String> createSaveRegistrationDraftSignText(String value) {
        return new JAXBElement<String>(_SaveRegistrationDraftSignText_QNAME, String.class, SaveRegistrationDraft.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fromDate", scope = GetCasesForContact.class)
    public JAXBElement<XMLGregorianCalendar> createGetCasesForContactFromDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetCasesForContactFromDate_QNAME, XMLGregorianCalendar.class, GetCasesForContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = GetCasesForContact.class)
    public JAXBElement<ContactAuthenticationInfo> createGetCasesForContactAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, GetCasesForContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Form }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "form", scope = RegisterCaseWithHandler.class)
    public JAXBElement<Form> createRegisterCaseWithHandlerForm(Form value) {
        return new JAXBElement<Form>(_RegisterCaseWithContactDetailsForm_QNAME, Form.class, RegisterCaseWithHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactAuthenticationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authenticationInfo", scope = RegisterCaseWithHandler.class)
    public JAXBElement<ContactAuthenticationInfo> createRegisterCaseWithHandlerAuthenticationInfo(ContactAuthenticationInfo value) {
        return new JAXBElement<ContactAuthenticationInfo>(_GetRequestedContactFieldsPrefilledAuthenticationInfo_QNAME, ContactAuthenticationInfo.class, RegisterCaseWithHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "handlerGuid", scope = RegisterCaseWithHandler.class)
    public JAXBElement<String> createRegisterCaseWithHandlerHandlerGuid(String value) {
        return new JAXBElement<String>(_RegisterCaseWithHandlerAndContactDetailsHandlerGuid_QNAME, String.class, RegisterCaseWithHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "signData", scope = RegisterCaseWithHandler.class)
    public JAXBElement<SignData> createRegisterCaseWithHandlerSignData(SignData value) {
        return new JAXBElement<SignData>(_RegisterCaseWithContactDetailsSignData_QNAME, SignData.class, RegisterCaseWithHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "handlerGroupGuid", scope = RegisterCaseWithHandler.class)
    public JAXBElement<String> createRegisterCaseWithHandlerHandlerGroupGuid(String value) {
        return new JAXBElement<String>(_RegisterCaseWithHandlerAndContactDetailsHandlerGroupGuid_QNAME, String.class, RegisterCaseWithHandler.class, value);
    }

}
