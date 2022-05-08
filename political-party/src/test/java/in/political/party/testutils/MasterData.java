package in.political.party.testutils;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.political.party.dto.DevelopmentDto;
import in.political.party.dto.LeaderDto;
import in.political.party.dto.PartyDto;


public class MasterData {

	public static PartyDto getPartyDto() {
		PartyDto PartyDto = new PartyDto();
		PartyDto.setPoliticalPartyId(1L);
		PartyDto.setPartyName("Local Party");
		PartyDto.setFounderName("Ram");
		PartyDto.setFoundationYear(1985);
		return PartyDto;
	}

	public static List<PartyDto> getPartyDtoList() {
		List<PartyDto> PartyDtos = new ArrayList<PartyDto>();
		PartyDto PartyDto = new PartyDto();
		PartyDto.setPoliticalPartyId(1L);
		PartyDto.setPartyName("Local Party");
		PartyDto.setFounderName("Ram");
		PartyDto.setFoundationYear(1985);
		PartyDtos.add(PartyDto);
		PartyDto = new PartyDto();
		PartyDto.setPoliticalPartyId(2L);
		PartyDto.setPartyName("State Party");
		PartyDto.setFounderName("Alanas");
		PartyDto.setFoundationYear(2000L);
		PartyDtos.add(PartyDto);
		return PartyDtos;
	}

	public static LeaderDto getLeaderDto() {
		LeaderDto LeaderDto = new LeaderDto();
		LeaderDto.setPoliticalLeaderId(1L);
		LeaderDto.setPoliticalPartyId(1L);
		LeaderDto.setCandidateName("Leena");
		LeaderDto.setCandidateState("Karnataka");
		return LeaderDto;
	}

	public static List<LeaderDto> getLeaderDtoList() {
		List<LeaderDto> LeaderDtos = new ArrayList<>();
		LeaderDto LeaderDto = new LeaderDto();
		LeaderDto.setPoliticalLeaderId(1L);
		LeaderDto.setPoliticalPartyId(1L);
		LeaderDto.setCandidateName("Krishna");
		LeaderDto.setCandidateState("Telangana");
		LeaderDtos.add(LeaderDto);
		LeaderDto = new LeaderDto();
		LeaderDto.setPoliticalLeaderId(2L);
		LeaderDto.setPoliticalPartyId(2L);
		LeaderDto.setCandidateName("Abhi");
		LeaderDto.setCandidateState("Karnataka");
		LeaderDtos.add(LeaderDto);
		return LeaderDtos;
	}

	public static DevelopmentDto getDevelopmentDto() {
		DevelopmentDto developmentDto = new DevelopmentDto();
		developmentDto.setDevelopmentId(1L);
		developmentDto.setPoliticalLeaderId(1L);
		developmentDto.setTitle("Leader");
		developmentDto.setBudget("1500000");
		developmentDto.setActivity("Grouping");
		developmentDto.setActivityMonth(5);
		developmentDto.setActivityYear(2012);
		developmentDto.setState("Telangana");
		return developmentDto;

	}

	public static List<DevelopmentDto> getDevelopmentDtoList() {
		List<DevelopmentDto> developmentDtos = new ArrayList<>();
		DevelopmentDto developmentDto = new DevelopmentDto();
		developmentDto.setDevelopmentId(1L);
		developmentDto.setPoliticalLeaderId(1L);
		developmentDto.setTitle("Leader");
		developmentDto.setBudget("1500000");
		developmentDto.setActivity("Grouping");
		developmentDto.setActivityMonth(5);
		developmentDto.setActivityYear(2012);
		developmentDto.setState("Telangana");
		developmentDtos.add(developmentDto);
		developmentDto = new DevelopmentDto();
		developmentDto.setDevelopmentId(2L);
		developmentDto.setPoliticalLeaderId(2L);
		developmentDto.setTitle("Health Camp");
		developmentDto.setBudget("187221");
		developmentDto.setActivity("Organizing Health Camp");
		developmentDto.setActivityMonth(9);
		developmentDto.setActivityYear(2014);
		developmentDto.setState("Karnataka");
		developmentDtos.add(developmentDto);
		return developmentDtos;

	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
