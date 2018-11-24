package org.hasadna.bus;

import org.assertj.core.api.Assertions;
import org.hasadna.bus.util.Util;
import org.junit.Test;


public class UtilTest {



    @Test
    public void testRemoveSoapEnvelope() {
        String soapResponse = SOAP_RESPONSE_1;
        Assertions.assertThat(soapResponse)
                .startsWith("<?xml version='1.0' encoding='UTF-8'?>")
                .contains("<S:Envelope")
                .contains("<S:Envelope")
                .contains("Body")
                .contains("</S:Body></S:Envelope>");

        String xmlWithoutEnvelope = Util.removeSoapEnvelope(soapResponse);
        Assertions.assertThat(xmlWithoutEnvelope)
                .doesNotStartWith("<?xml version='1.0' encoding='UTF-8'?>")
                .doesNotStartWith("<S:Envelope")
                .doesNotContain("<S:Envelope")
                .doesNotContain("Body")
                .doesNotContain("</S:Body></S:Envelope>")
                .contains("<ns7:GetStopMonitoringServiceResponse")
                .contains("</ns7:GetStopMonitoringServiceResponse>")
        ;
    }



    public final String SOAP_RESPONSE_1 = "<?xml version='1.0' encoding='UTF-8'?><S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\"><S:Body><ns7:GetStopMonitoringServiceResponse xmlns:ns3=\"http://www.siri.org.uk/siri\" xmlns:ns4=\"http://www.ifopt.org.uk/acsb\" xmlns:ns5=\"http://www.ifopt.org.uk/ifopt\" xmlns:ns6=\"http://datex2.eu/schema/1_0/1_0\" xmlns:ns7=\"http://new.webservice.namespace\"><Answer><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:ProducerRef>ISR Siri Server (141.12)</ns3:ProducerRef><ns3:ResponseMessageIdentifier>22634694</ns3:ResponseMessageIdentifier><ns3:RequestMessageRef>0100700:1351669188:4684</ns3:RequestMessageRef><ns3:Status>true</ns3:Status><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:12.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724314</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458131</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T20:00:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.85939407348633</ns3:Longitude><ns3:Latitude>31.917808532714844</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8331253</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T22:22:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724316</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724319</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724321</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724324</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724327</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724329</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724331</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724334</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724337</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724339</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724342</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery><ns3:StopMonitoringDelivery version=\"IL2.7\"><ns3:ResponseTimestamp>2018-09-03T22:17:14.603+03:00</ns3:ResponseTimestamp><ns3:Status>true</ns3:Status><ns3:MonitoredStopVisit><ns3:RecordedAtTime>2018-09-03T22:17:11.000+03:00</ns3:RecordedAtTime><ns3:ItemIdentifier>1049724344</ns3:ItemIdentifier><ns3:MonitoringRef>35744</ns3:MonitoringRef><ns3:MonitoredVehicleJourney><ns3:LineRef>11494</ns3:LineRef><ns3:DirectionRef>2</ns3:DirectionRef><ns3:FramedVehicleJourneyRef><ns3:DataFrameRef>2018-09-03</ns3:DataFrameRef><ns3:DatedVehicleJourneyRef>29458134</ns3:DatedVehicleJourneyRef></ns3:FramedVehicleJourneyRef><ns3:PublishedLineName>371</ns3:PublishedLineName><ns3:OperatorRef>15</ns3:OperatorRef><ns3:DestinationRef>35744</ns3:DestinationRef><ns3:OriginAimedDepartureTime>2018-09-03T21:30:00.000+03:00</ns3:OriginAimedDepartureTime><ns3:VehicleLocation><ns3:Longitude>34.760990142822266</ns3:Longitude><ns3:Latitude>31.606674194335938</ns3:Latitude></ns3:VehicleLocation><ns3:VehicleRef>8335753</ns3:VehicleRef><ns3:MonitoredCall><ns3:StopPointRef>35744</ns3:StopPointRef><ns3:ExpectedArrivalTime>2018-09-03T23:25:00.000+03:00</ns3:ExpectedArrivalTime></ns3:MonitoredCall></ns3:MonitoredVehicleJourney></ns3:MonitoredStopVisit></ns3:StopMonitoringDelivery></Answer></ns7:GetStopMonitoringServiceResponse></S:Body></S:Envelope>\n";
}