
package com.erpl.employee.wsdl2java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.erpl.employee.wsdl2java package. 
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

    private final static QName _EmployeeBasicDataByIdentificationQuerySync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "EmployeeBasicDataByIdentificationQuery_sync");
    private final static QName _EmployeeBasicDataByIdentificationResponseSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "EmployeeBasicDataByIdentificationResponse_sync");
    private final static QName _EmployeeBiographicalDataByIdentificationQuerySync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "EmployeeBiographicalDataByIdentificationQuery_sync");
    private final static QName _EmployeeBiographicalDataByIdentificationResponseSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "EmployeeBiographicalDataByIdentificationResponse_sync");
    private final static QName _EmployeeDataByIdentificationQuerySync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "EmployeeDataByIdentificationQuery_sync");
    private final static QName _EmployeeDataByIdentificationResponseSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "EmployeeDataByIdentificationResponse_sync");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.erpl.employee.wsdl2java
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeBasicDataByIdentificationQueryMessageSync }
     * 
     */
    public EmployeeBasicDataByIdentificationQueryMessageSync createEmployeeBasicDataByIdentificationQueryMessageSync() {
        return new EmployeeBasicDataByIdentificationQueryMessageSync();
    }

    /**
     * Create an instance of {@link EmployeeBasicDataResponseMessageSync }
     * 
     */
    public EmployeeBasicDataResponseMessageSync createEmployeeBasicDataResponseMessageSync() {
        return new EmployeeBasicDataResponseMessageSync();
    }

    /**
     * Create an instance of {@link EmployeeBiographicalDataByIdentificationQueryMessageSync }
     * 
     */
    public EmployeeBiographicalDataByIdentificationQueryMessageSync createEmployeeBiographicalDataByIdentificationQueryMessageSync() {
        return new EmployeeBiographicalDataByIdentificationQueryMessageSync();
    }

    /**
     * Create an instance of {@link EmployeeBiographicalDataResponseMessageSync }
     * 
     */
    public EmployeeBiographicalDataResponseMessageSync createEmployeeBiographicalDataResponseMessageSync() {
        return new EmployeeBiographicalDataResponseMessageSync();
    }

    /**
     * Create an instance of {@link EmployeeDataSimpleByQueryMessageSync }
     * 
     */
    public EmployeeDataSimpleByQueryMessageSync createEmployeeDataSimpleByQueryMessageSync() {
        return new EmployeeDataSimpleByQueryMessageSync();
    }

    /**
     * Create an instance of {@link EmployeeDataSimpleByResponseMessageSync }
     * 
     */
    public EmployeeDataSimpleByResponseMessageSync createEmployeeDataSimpleByResponseMessageSync() {
        return new EmployeeDataSimpleByResponseMessageSync();
    }

    /**
     * Create an instance of {@link StandardFaultMessage }
     * 
     */
    public StandardFaultMessage createStandardFaultMessage() {
        return new StandardFaultMessage();
    }

    /**
     * Create an instance of {@link ExchangeFaultData }
     * 
     */
    public ExchangeFaultData createExchangeFaultData() {
        return new ExchangeFaultData();
    }

    /**
     * Create an instance of {@link StandardFaultMessageExtension }
     * 
     */
    public StandardFaultMessageExtension createStandardFaultMessageExtension() {
        return new StandardFaultMessageExtension();
    }

    /**
     * Create an instance of {@link ExchangeLogData }
     * 
     */
    public ExchangeLogData createExchangeLogData() {
        return new ExchangeLogData();
    }

    /**
     * Create an instance of {@link EmployeeBasicDataSelectionByIdentification }
     * 
     */
    public EmployeeBasicDataSelectionByIdentification createEmployeeBasicDataSelectionByIdentification() {
        return new EmployeeBasicDataSelectionByIdentification();
    }

    /**
     * Create an instance of {@link EmployeeBiographicalDataSelectionByIdentification }
     * 
     */
    public EmployeeBiographicalDataSelectionByIdentification createEmployeeBiographicalDataSelectionByIdentification() {
        return new EmployeeBiographicalDataSelectionByIdentification();
    }

    /**
     * Create an instance of {@link EmployeeDataQueryResponseWPAddress }
     * 
     */
    public EmployeeDataQueryResponseWPAddress createEmployeeDataQueryResponseWPAddress() {
        return new EmployeeDataQueryResponseWPAddress();
    }

    /**
     * Create an instance of {@link EmployeeDataReponseBiograhicalData }
     * 
     */
    public EmployeeDataReponseBiograhicalData createEmployeeDataReponseBiograhicalData() {
        return new EmployeeDataReponseBiograhicalData();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseAddressInformation }
     * 
     */
    public EmployeeDataResponseAddressInformation createEmployeeDataResponseAddressInformation() {
        return new EmployeeDataResponseAddressInformation();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseEmployee }
     * 
     */
    public EmployeeDataResponseEmployee createEmployeeDataResponseEmployee() {
        return new EmployeeDataResponseEmployee();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseEmployment }
     * 
     */
    public EmployeeDataResponseEmployment createEmployeeDataResponseEmployment() {
        return new EmployeeDataResponseEmployment();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseJobAssignment }
     * 
     */
    public EmployeeDataResponseJobAssignment createEmployeeDataResponseJobAssignment() {
        return new EmployeeDataResponseJobAssignment();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkAgreement }
     * 
     */
    public EmployeeDataResponseWorkAgreement createEmployeeDataResponseWorkAgreement() {
        return new EmployeeDataResponseWorkAgreement();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkAgreementAdditionalClauses }
     * 
     */
    public EmployeeDataResponseWorkAgreementAdditionalClauses createEmployeeDataResponseWorkAgreementAdditionalClauses() {
        return new EmployeeDataResponseWorkAgreementAdditionalClauses();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkAgreementCostCenter }
     * 
     */
    public EmployeeDataResponseWorkAgreementCostCenter createEmployeeDataResponseWorkAgreementCostCenter() {
        return new EmployeeDataResponseWorkAgreementCostCenter();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkAgreementJobDetails }
     * 
     */
    public EmployeeDataResponseWorkAgreementJobDetails createEmployeeDataResponseWorkAgreementJobDetails() {
        return new EmployeeDataResponseWorkAgreementJobDetails();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkAgreementOrganisationalDetails }
     * 
     */
    public EmployeeDataResponseWorkAgreementOrganisationalDetails createEmployeeDataResponseWorkAgreementOrganisationalDetails() {
        return new EmployeeDataResponseWorkAgreementOrganisationalDetails();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod }
     * 
     */
    public EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod createEmployeeDataResponseWorkAgreementOrganisationalValidityPeriod() {
        return new EmployeeDataResponseWorkAgreementOrganisationalValidityPeriod();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkAgreementPositionAssignment }
     * 
     */
    public EmployeeDataResponseWorkAgreementPositionAssignment createEmployeeDataResponseWorkAgreementPositionAssignment() {
        return new EmployeeDataResponseWorkAgreementPositionAssignment();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkAgreementReportingLineUnit }
     * 
     */
    public EmployeeDataResponseWorkAgreementReportingLineUnit createEmployeeDataResponseWorkAgreementReportingLineUnit() {
        return new EmployeeDataResponseWorkAgreementReportingLineUnit();
    }

    /**
     * Create an instance of {@link EmployeeDataResponseWorkplaceAddressInformation }
     * 
     */
    public EmployeeDataResponseWorkplaceAddressInformation createEmployeeDataResponseWorkplaceAddressInformation() {
        return new EmployeeDataResponseWorkplaceAddressInformation();
    }

    /**
     * Create an instance of {@link EmployeeDataSelectionByIdentification }
     * 
     */
    public EmployeeDataSelectionByIdentification createEmployeeDataSelectionByIdentification() {
        return new EmployeeDataSelectionByIdentification();
    }

    /**
     * Create an instance of {@link EmployeeQueryAddressFascimile }
     * 
     */
    public EmployeeQueryAddressFascimile createEmployeeQueryAddressFascimile() {
        return new EmployeeQueryAddressFascimile();
    }

    /**
     * Create an instance of {@link EmployeeQueryResponseAddress }
     * 
     */
    public EmployeeQueryResponseAddress createEmployeeQueryResponseAddress() {
        return new EmployeeQueryResponseAddress();
    }

    /**
     * Create an instance of {@link EmployeeQueryResponseAddressEmail }
     * 
     */
    public EmployeeQueryResponseAddressEmail createEmployeeQueryResponseAddressEmail() {
        return new EmployeeQueryResponseAddressEmail();
    }

    /**
     * Create an instance of {@link EmployeeQueryResponseAddressOrganisationName }
     * 
     */
    public EmployeeQueryResponseAddressOrganisationName createEmployeeQueryResponseAddressOrganisationName() {
        return new EmployeeQueryResponseAddressOrganisationName();
    }

    /**
     * Create an instance of {@link EmployeeQueryResponseAddressPostalAddress }
     * 
     */
    public EmployeeQueryResponseAddressPostalAddress createEmployeeQueryResponseAddressPostalAddress() {
        return new EmployeeQueryResponseAddressPostalAddress();
    }

    /**
     * Create an instance of {@link EmployeeQueryResponseAddressTelephone }
     * 
     */
    public EmployeeQueryResponseAddressTelephone createEmployeeQueryResponseAddressTelephone() {
        return new EmployeeQueryResponseAddressTelephone();
    }

    /**
     * Create an instance of {@link EmployeeQueryResponseAddressWeb }
     * 
     */
    public EmployeeQueryResponseAddressWeb createEmployeeQueryResponseAddressWeb() {
        return new EmployeeQueryResponseAddressWeb();
    }

    /**
     * Create an instance of {@link EmployeeQueryResponseAddressWorkplace }
     * 
     */
    public EmployeeQueryResponseAddressWorkplace createEmployeeQueryResponseAddressWorkplace() {
        return new EmployeeQueryResponseAddressWorkplace();
    }

    /**
     * Create an instance of {@link EmployeeQueryResponseWorkplaceOrganisationAddress }
     * 
     */
    public EmployeeQueryResponseWorkplaceOrganisationAddress createEmployeeQueryResponseWorkplaceOrganisationAddress() {
        return new EmployeeQueryResponseWorkplaceOrganisationAddress();
    }

    /**
     * Create an instance of {@link EmployeeReponseBasicData }
     * 
     */
    public EmployeeReponseBasicData createEmployeeReponseBasicData() {
        return new EmployeeReponseBasicData();
    }

    /**
     * Create an instance of {@link EmployeeReponseBiograhicalData }
     * 
     */
    public EmployeeReponseBiograhicalData createEmployeeReponseBiograhicalData() {
        return new EmployeeReponseBiograhicalData();
    }

    /**
     * Create an instance of {@link EmployeeReponseEmployeeFormattedAddress }
     * 
     */
    public EmployeeReponseEmployeeFormattedAddress createEmployeeReponseEmployeeFormattedAddress() {
        return new EmployeeReponseEmployeeFormattedAddress();
    }

    /**
     * Create an instance of {@link EmployeeReponseEmployeeOrganisationalAddressPostalAddress }
     * 
     */
    public EmployeeReponseEmployeeOrganisationalAddressPostalAddress createEmployeeReponseEmployeeOrganisationalAddressPostalAddress() {
        return new EmployeeReponseEmployeeOrganisationalAddressPostalAddress();
    }

    /**
     * Create an instance of {@link EmployeeReponseEmployeeWorkplaceAddress }
     * 
     */
    public EmployeeReponseEmployeeWorkplaceAddress createEmployeeReponseEmployeeWorkplaceAddress() {
        return new EmployeeReponseEmployeeWorkplaceAddress();
    }

    /**
     * Create an instance of {@link EmployeeReponseEmployeeWorkplaceAddressInformation }
     * 
     */
    public EmployeeReponseEmployeeWorkplaceAddressInformation createEmployeeReponseEmployeeWorkplaceAddressInformation() {
        return new EmployeeReponseEmployeeWorkplaceAddressInformation();
    }

    /**
     * Create an instance of {@link EmployeeReponseEmployeeWorkplaceAddressWorkplace }
     * 
     */
    public EmployeeReponseEmployeeWorkplaceAddressWorkplace createEmployeeReponseEmployeeWorkplaceAddressWorkplace() {
        return new EmployeeReponseEmployeeWorkplaceAddressWorkplace();
    }

    /**
     * Create an instance of {@link EmployeeRequestedElements }
     * 
     */
    public EmployeeRequestedElements createEmployeeRequestedElements() {
        return new EmployeeRequestedElements();
    }

    /**
     * Create an instance of {@link EmployeeRequestedElementsEmployee }
     * 
     */
    public EmployeeRequestedElementsEmployee createEmployeeRequestedElementsEmployee() {
        return new EmployeeRequestedElementsEmployee();
    }

    /**
     * Create an instance of {@link EmployeeSelectionByChangedSinceDate }
     * 
     */
    public EmployeeSelectionByChangedSinceDate createEmployeeSelectionByChangedSinceDate() {
        return new EmployeeSelectionByChangedSinceDate();
    }

    /**
     * Create an instance of {@link EmployeeSelectionByCreatedSinceDate }
     * 
     */
    public EmployeeSelectionByCreatedSinceDate createEmployeeSelectionByCreatedSinceDate() {
        return new EmployeeSelectionByCreatedSinceDate();
    }

    /**
     * Create an instance of {@link EmployeeSelectionByCreationIdentityID }
     * 
     */
    public EmployeeSelectionByCreationIdentityID createEmployeeSelectionByCreationIdentityID() {
        return new EmployeeSelectionByCreationIdentityID();
    }

    /**
     * Create an instance of {@link EmployeeSelectionByEmployeeFamilyName }
     * 
     */
    public EmployeeSelectionByEmployeeFamilyName createEmployeeSelectionByEmployeeFamilyName() {
        return new EmployeeSelectionByEmployeeFamilyName();
    }

    /**
     * Create an instance of {@link EmployeeSelectionByEmployeeGivenName }
     * 
     */
    public EmployeeSelectionByEmployeeGivenName createEmployeeSelectionByEmployeeGivenName() {
        return new EmployeeSelectionByEmployeeGivenName();
    }

    /**
     * Create an instance of {@link EmployeeSelectionByEmployeeID }
     * 
     */
    public EmployeeSelectionByEmployeeID createEmployeeSelectionByEmployeeID() {
        return new EmployeeSelectionByEmployeeID();
    }

    /**
     * Create an instance of {@link EmployeeSelectionByLastChangeIdentityID }
     * 
     */
    public EmployeeSelectionByLastChangeIdentityID createEmployeeSelectionByLastChangeIdentityID() {
        return new EmployeeSelectionByLastChangeIdentityID();
    }

    /**
     * Create an instance of {@link AcademicTitleCode }
     * 
     */
    public AcademicTitleCode createAcademicTitleCode() {
        return new AcademicTitleCode();
    }

    /**
     * Create an instance of {@link AddressRepresentationCode }
     * 
     */
    public AddressRepresentationCode createAddressRepresentationCode() {
        return new AddressRepresentationCode();
    }

    /**
     * Create an instance of {@link AgreedWorkingHoursRate }
     * 
     */
    public AgreedWorkingHoursRate createAgreedWorkingHoursRate() {
        return new AgreedWorkingHoursRate();
    }

    /**
     * Create an instance of {@link CLOSEDDatePeriod }
     * 
     */
    public CLOSEDDatePeriod createCLOSEDDatePeriod() {
        return new CLOSEDDatePeriod();
    }

    /**
     * Create an instance of {@link EmailURI }
     * 
     */
    public EmailURI createEmailURI() {
        return new EmailURI();
    }

    /**
     * Create an instance of {@link EmployeeID }
     * 
     */
    public EmployeeID createEmployeeID() {
        return new EmployeeID();
    }

    /**
     * Create an instance of {@link FormOfAddressCode }
     * 
     */
    public FormOfAddressCode createFormOfAddressCode() {
        return new FormOfAddressCode();
    }

    /**
     * Create an instance of {@link FormattedAddress }
     * 
     */
    public FormattedAddress createFormattedAddress() {
        return new FormattedAddress();
    }

    /**
     * Create an instance of {@link FormattedPostalAddress }
     * 
     */
    public FormattedPostalAddress createFormattedPostalAddress() {
        return new FormattedPostalAddress();
    }

    /**
     * Create an instance of {@link IdentityID }
     * 
     */
    public IdentityID createIdentityID() {
        return new IdentityID();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link LogItem }
     * 
     */
    public LogItem createLogItem() {
        return new LogItem();
    }

    /**
     * Create an instance of {@link LogItemCategoryCode }
     * 
     */
    public LogItemCategoryCode createLogItemCategoryCode() {
        return new LogItemCategoryCode();
    }

    /**
     * Create an instance of {@link LogItemNotePlaceholderSubstitutionList }
     * 
     */
    public LogItemNotePlaceholderSubstitutionList createLogItemNotePlaceholderSubstitutionList() {
        return new LogItemNotePlaceholderSubstitutionList();
    }

    /**
     * Create an instance of {@link MEDIUMName }
     * 
     */
    public MEDIUMName createMEDIUMName() {
        return new MEDIUMName();
    }

    /**
     * Create an instance of {@link MailNonDeliveryReasonCode }
     * 
     */
    public MailNonDeliveryReasonCode createMailNonDeliveryReasonCode() {
        return new MailNonDeliveryReasonCode();
    }

    /**
     * Create an instance of {@link MaritalStatusCode }
     * 
     */
    public MaritalStatusCode createMaritalStatusCode() {
        return new MaritalStatusCode();
    }

    /**
     * Create an instance of {@link ObjectID }
     * 
     */
    public ObjectID createObjectID() {
        return new ObjectID();
    }

    /**
     * Create an instance of {@link OrganisationName }
     * 
     */
    public OrganisationName createOrganisationName() {
        return new OrganisationName();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link PositionID }
     * 
     */
    public PositionID createPositionID() {
        return new PositionID();
    }

    /**
     * Create an instance of {@link QueryProcessingConditions }
     * 
     */
    public QueryProcessingConditions createQueryProcessingConditions() {
        return new QueryProcessingConditions();
    }

    /**
     * Create an instance of {@link RegionCode }
     * 
     */
    public RegionCode createRegionCode() {
        return new RegionCode();
    }

    /**
     * Create an instance of {@link RegionalStructureElementGroupCode }
     * 
     */
    public RegionalStructureElementGroupCode createRegionalStructureElementGroupCode() {
        return new RegionalStructureElementGroupCode();
    }

    /**
     * Create an instance of {@link ResponseProcessingConditions }
     * 
     */
    public ResponseProcessingConditions createResponseProcessingConditions() {
        return new ResponseProcessingConditions();
    }

    /**
     * Create an instance of {@link SystemAdministrativeData }
     * 
     */
    public SystemAdministrativeData createSystemAdministrativeData() {
        return new SystemAdministrativeData();
    }

    /**
     * Create an instance of {@link TaxJurisdictionCode }
     * 
     */
    public TaxJurisdictionCode createTaxJurisdictionCode() {
        return new TaxJurisdictionCode();
    }

    /**
     * Create an instance of {@link UUID }
     * 
     */
    public UUID createUUID() {
        return new UUID();
    }

    /**
     * Create an instance of {@link WorkAgreementAdministrativeCategoryCode }
     * 
     */
    public WorkAgreementAdministrativeCategoryCode createWorkAgreementAdministrativeCategoryCode() {
        return new WorkAgreementAdministrativeCategoryCode();
    }

    /**
     * Create an instance of {@link WorkAgreementID }
     * 
     */
    public WorkAgreementID createWorkAgreementID() {
        return new WorkAgreementID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeBasicDataByIdentificationQueryMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeBasicDataByIdentificationQueryMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "EmployeeBasicDataByIdentificationQuery_sync")
    public JAXBElement<EmployeeBasicDataByIdentificationQueryMessageSync> createEmployeeBasicDataByIdentificationQuerySync(EmployeeBasicDataByIdentificationQueryMessageSync value) {
        return new JAXBElement<EmployeeBasicDataByIdentificationQueryMessageSync>(_EmployeeBasicDataByIdentificationQuerySync_QNAME, EmployeeBasicDataByIdentificationQueryMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeBasicDataResponseMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeBasicDataResponseMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "EmployeeBasicDataByIdentificationResponse_sync")
    public JAXBElement<EmployeeBasicDataResponseMessageSync> createEmployeeBasicDataByIdentificationResponseSync(EmployeeBasicDataResponseMessageSync value) {
        return new JAXBElement<EmployeeBasicDataResponseMessageSync>(_EmployeeBasicDataByIdentificationResponseSync_QNAME, EmployeeBasicDataResponseMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeBiographicalDataByIdentificationQueryMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeBiographicalDataByIdentificationQueryMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "EmployeeBiographicalDataByIdentificationQuery_sync")
    public JAXBElement<EmployeeBiographicalDataByIdentificationQueryMessageSync> createEmployeeBiographicalDataByIdentificationQuerySync(EmployeeBiographicalDataByIdentificationQueryMessageSync value) {
        return new JAXBElement<EmployeeBiographicalDataByIdentificationQueryMessageSync>(_EmployeeBiographicalDataByIdentificationQuerySync_QNAME, EmployeeBiographicalDataByIdentificationQueryMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeBiographicalDataResponseMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeBiographicalDataResponseMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "EmployeeBiographicalDataByIdentificationResponse_sync")
    public JAXBElement<EmployeeBiographicalDataResponseMessageSync> createEmployeeBiographicalDataByIdentificationResponseSync(EmployeeBiographicalDataResponseMessageSync value) {
        return new JAXBElement<EmployeeBiographicalDataResponseMessageSync>(_EmployeeBiographicalDataByIdentificationResponseSync_QNAME, EmployeeBiographicalDataResponseMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeDataSimpleByQueryMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeDataSimpleByQueryMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "EmployeeDataByIdentificationQuery_sync")
    public JAXBElement<EmployeeDataSimpleByQueryMessageSync> createEmployeeDataByIdentificationQuerySync(EmployeeDataSimpleByQueryMessageSync value) {
        return new JAXBElement<EmployeeDataSimpleByQueryMessageSync>(_EmployeeDataByIdentificationQuerySync_QNAME, EmployeeDataSimpleByQueryMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeDataSimpleByResponseMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeDataSimpleByResponseMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "EmployeeDataByIdentificationResponse_sync")
    public JAXBElement<EmployeeDataSimpleByResponseMessageSync> createEmployeeDataByIdentificationResponseSync(EmployeeDataSimpleByResponseMessageSync value) {
        return new JAXBElement<EmployeeDataSimpleByResponseMessageSync>(_EmployeeDataByIdentificationResponseSync_QNAME, EmployeeDataSimpleByResponseMessageSync.class, null, value);
    }

}
