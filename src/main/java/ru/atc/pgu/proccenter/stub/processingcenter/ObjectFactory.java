
package ru.atc.pgu.proccenter.stub.processingcenter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.atc.pgu.proccenter.stub.rev120315.BaseMessageType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.atc.pgu.proccenter.stub.processingcenter package.
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

    private final static QName _Response_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "Response");
    private final static QName _RegNumberRequest_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "regNumberRequest");
    private final static QName _SearchParticipantsResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "searchParticipantsResponse");
    private final static QName _RegistrationAndVoteResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "registrationAndVoteResponse");
    private final static QName _GetRegNumbers_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "GetRegNumbers");
    private final static QName _SearchResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "SearchResponse");
    private final static QName _DictionaryData_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "DictionaryData");
    private final static QName _SearchParticipantResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "SearchParticipantResponse");
    private final static QName _Vote_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "Vote");
    private final static QName _RegistrationAndVoteRequest_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "registrationAndVoteRequest");
    private final static QName _SearchCitiesResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "SearchCitiesResponse");
    private final static QName _RegNumberResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "regNumberResponse");
    private final static QName _SearchSchoolClassResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "SearchSchoolClassResponse");
    private final static QName _DictionaryDataResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "DictionaryDataResponse");
    private final static QName _RegistrationAction_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "RegistrationAction");
    private final static QName _SearchParticipants_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "SearchParticipants");
    private final static QName _DictionaryRequest_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "dictionaryRequest");
    private final static QName _DictionaryResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "dictionaryResponse");
    private final static QName _SearchParticipantsRequest_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "searchParticipantsRequest");
    private final static QName _RegNumbers_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "RegNumbers");
    private final static QName _SearchSchoolResponse_QNAME = new QName("http://pgu.gosuslugi.ru/ProcessingCenter", "SearchSchoolResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.atc.pgu.proccenter.stub.processingcenter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchTOPType }
     * 
     */
    public SearchTOPType createSearchTOPType() {
        return new SearchTOPType();
    }

    /**
     * Create an instance of {@link VoteType }
     * 
     */
    public VoteType createVoteType() {
        return new VoteType();
    }

    /**
     * Create an instance of {@link DataVoterType }
     * 
     */
    public DataVoterType createDataVoterType() {
        return new DataVoterType();
    }

    /**
     * Create an instance of {@link RegNumbersResponse }
     * 
     */
    public RegNumbersResponse createRegNumbersResponse() {
        return new RegNumbersResponse();
    }

    /**
     * Create an instance of {@link RegNumbersType }
     * 
     */
    public RegNumbersType createRegNumbersType() {
        return new RegNumbersType();
    }

    /**
     * Create an instance of {@link SearchParticipantsType }
     * 
     */
    public SearchParticipantsType createSearchParticipantsType() {
        return new SearchParticipantsType();
    }

    /**
     * Create an instance of {@link SchoolClassType }
     * 
     */
    public SchoolClassType createSchoolClassType() {
        return new SchoolClassType();
    }

    /**
     * Create an instance of {@link SchoolType }
     * 
     */
    public SchoolType createSchoolType() {
        return new SchoolType();
    }

    /**
     * Create an instance of {@link RegistrationActionType }
     * 
     */
    public RegistrationActionType createRegistrationActionType() {
        return new RegistrationActionType();
    }

    /**
     * Create an instance of {@link SearchParticipantsByFIOType }
     * 
     */
    public SearchParticipantsByFIOType createSearchParticipantsByFIOType() {
        return new SearchParticipantsByFIOType();
    }

    /**
     * Create an instance of {@link ResultParticipantType }
     * 
     */
    public ResultParticipantType createResultParticipantType() {
        return new ResultParticipantType();
    }

    /**
     * Create an instance of {@link SearchParticipantsByFieldType }
     * 
     */
    public SearchParticipantsByFieldType createSearchParticipantsByFieldType() {
        return new SearchParticipantsByFieldType();
    }

    /**
     * Create an instance of {@link SearchCitiesResponseAppDataType }
     * 
     */
    public SearchCitiesResponseAppDataType createSearchCitiesResponseAppDataType() {
        return new SearchCitiesResponseAppDataType();
    }

    /**
     * Create an instance of {@link ResponseAppDataType }
     * 
     */
    public ResponseAppDataType createResponseAppDataType() {
        return new ResponseAppDataType();
    }

    /**
     * Create an instance of {@link RegNumbersResponseAppDataType }
     * 
     */
    public RegNumbersResponseAppDataType createRegNumbersResponseAppDataType() {
        return new RegNumbersResponseAppDataType();
    }

    /**
     * Create an instance of {@link CityType }
     * 
     */
    public CityType createCityType() {
        return new CityType();
    }

    /**
     * Create an instance of {@link SearchResponseAppDataType }
     * 
     */
    public SearchResponseAppDataType createSearchResponseAppDataType() {
        return new SearchResponseAppDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseAppDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "Response")
    public JAXBElement<ResponseAppDataType> createResponse(ResponseAppDataType value) {
        return new JAXBElement<ResponseAppDataType>(_Response_QNAME, ResponseAppDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "regNumberRequest")
    public JAXBElement<BaseMessageType> createRegNumberRequest(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_RegNumberRequest_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "searchParticipantsResponse")
    public JAXBElement<BaseMessageType> createSearchParticipantsResponse(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_SearchParticipantsResponse_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "registrationAndVoteResponse")
    public JAXBElement<BaseMessageType> createRegistrationAndVoteResponse(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_RegistrationAndVoteResponse_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegNumbersResponseAppDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "GetRegNumbers")
    public JAXBElement<RegNumbersResponseAppDataType> createGetRegNumbers(RegNumbersResponseAppDataType value) {
        return new JAXBElement<RegNumbersResponseAppDataType>(_GetRegNumbers_QNAME, RegNumbersResponseAppDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponseAppDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "SearchResponse")
    public JAXBElement<SearchResponseAppDataType> createSearchResponse(SearchResponseAppDataType value) {
        return new JAXBElement<SearchResponseAppDataType>(_SearchResponse_QNAME, SearchResponseAppDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchParticipantsByFieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "DictionaryData")
    public JAXBElement<SearchParticipantsByFieldType> createDictionaryData(SearchParticipantsByFieldType value) {
        return new JAXBElement<SearchParticipantsByFieldType>(_DictionaryData_QNAME, SearchParticipantsByFieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "SearchParticipantResponse")
    public JAXBElement<RegistrationActionType> createSearchParticipantResponse(RegistrationActionType value) {
        return new JAXBElement<RegistrationActionType>(_SearchParticipantResponse_QNAME, RegistrationActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "Vote")
    public JAXBElement<VoteType> createVote(VoteType value) {
        return new JAXBElement<VoteType>(_Vote_QNAME, VoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "registrationAndVoteRequest")
    public JAXBElement<BaseMessageType> createRegistrationAndVoteRequest(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_RegistrationAndVoteRequest_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCitiesResponseAppDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "SearchCitiesResponse")
    public JAXBElement<SearchCitiesResponseAppDataType> createSearchCitiesResponse(SearchCitiesResponseAppDataType value) {
        return new JAXBElement<SearchCitiesResponseAppDataType>(_SearchCitiesResponse_QNAME, SearchCitiesResponseAppDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "regNumberResponse")
    public JAXBElement<BaseMessageType> createRegNumberResponse(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_RegNumberResponse_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchoolClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "SearchSchoolClassResponse")
    public JAXBElement<SchoolClassType> createSearchSchoolClassResponse(SchoolClassType value) {
        return new JAXBElement<SchoolClassType>(_SearchSchoolClassResponse_QNAME, SchoolClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCitiesResponseAppDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "DictionaryDataResponse")
    public JAXBElement<SearchCitiesResponseAppDataType> createDictionaryDataResponse(SearchCitiesResponseAppDataType value) {
        return new JAXBElement<SearchCitiesResponseAppDataType>(_DictionaryDataResponse_QNAME, SearchCitiesResponseAppDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "RegistrationAction")
    public JAXBElement<RegistrationActionType> createRegistrationAction(RegistrationActionType value) {
        return new JAXBElement<RegistrationActionType>(_RegistrationAction_QNAME, RegistrationActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchParticipantsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "SearchParticipants")
    public JAXBElement<SearchParticipantsType> createSearchParticipants(SearchParticipantsType value) {
        return new JAXBElement<SearchParticipantsType>(_SearchParticipants_QNAME, SearchParticipantsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "dictionaryRequest")
    public JAXBElement<BaseMessageType> createDictionaryRequest(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_DictionaryRequest_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "dictionaryResponse")
    public JAXBElement<BaseMessageType> createDictionaryResponse(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_DictionaryResponse_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "searchParticipantsRequest")
    public JAXBElement<BaseMessageType> createSearchParticipantsRequest(BaseMessageType value) {
        return new JAXBElement<BaseMessageType>(_SearchParticipantsRequest_QNAME, BaseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegNumbersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "RegNumbers")
    public JAXBElement<RegNumbersType> createRegNumbers(RegNumbersType value) {
        return new JAXBElement<RegNumbersType>(_RegNumbers_QNAME, RegNumbersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pgu.gosuslugi.ru/ProcessingCenter", name = "SearchSchoolResponse")
    public JAXBElement<CityType> createSearchSchoolResponse(CityType value) {
        return new JAXBElement<CityType>(_SearchSchoolResponse_QNAME, CityType.class, null, value);
    }

}
