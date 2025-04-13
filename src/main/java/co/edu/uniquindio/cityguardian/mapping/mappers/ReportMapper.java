package co.edu.uniquindio.cityguardian.mapping.mappers;


import co.edu.uniquindio.cityguardian.mapping.dto.CreateReportDto;
import co.edu.uniquindio.cityguardian.mapping.dto.ReportDto;
import co.edu.uniquindio.cityguardian.model.Report;
import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReportMapper {

    @Mapping(target = "status", constant = "CREATED")
    @Mapping(target = "category", constant = "WITHOUT_CATEGORY")
    @Mapping(target = "solved", constant = "false")
    @Mapping(target = "important", constant = "false")
    Report toDocument(CreateReportDto reportDto);

    CreateReportDto toDTO(Report report);

    ReportDto toReportDto(Report report);

    default String map(ObjectId value) {
        return value != null ? value.toString() : null;
    }

    default ObjectId map(String value) {
        return value != null ? new ObjectId(value) : null;
    }

}
