package co.edu.uniquindio.cityguardian.mapping.mappers;

import co.edu.uniquindio.cityguardian.mapping.dto.*;
import co.edu.uniquindio.cityguardian.model.*;
import org.mapstruct.factory.Mappers;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper (componentModel = "spring")
public interface CityGuardianMapper {


    //categoryDto
    @Named("categoryToCategoryDto")
    CategoryDto categoryToCategoryDto(Category category);

    Category categoryDtoToCategory(CategoryDto categoryDto);

   //@IterableMapping(qualifiedByName = "categoryToCategoryDto")

    //commentDto
    @Named("commentToCommentDto")
    CommentDto commentToCommentDto(Comment comment);

    Comment commentDtoToComment(CommentDto commentDto);

    //@IterableMapping(qualifiedByName = commentToCommentDto)


    //locationDto
    @Named("locationToLocationDto")
    LocationDto locationToLocationDto(Location location);

    Location locationDtoToLocation(LocationDto locationDto);
    //@IterableMapping(qualifiedByName = "locationToLocationDto")

    //notificationDto
    @Named("notificationToNotificationDto")
    NotificationDto notificationToNotificationDto(Notification notification);

    Notification notificationDtoToNotification(NotificationDto notificationDto);
    //@IterableMapping(qualifiedByName = "notificationToNotificationDto")

    //reportDto
    @Named("reportToReportDto")
    ReportDto reportToReportDto(Report report);

    Report reportDtoToReport(ReportDto reportDto);
    //@IterableMapping(qualifiedByName = "reportToReportDto")

    //statusHistoryDto
    @Named("statusHistoryToStatusHistoryDto")
    StatusHistoryDto statusHistoryToStatusHistoryDto(StatusHistory statusHistory);

    StatusHistory statusHistoryDtoToStatusHistory(StatusHistoryDto statusHistoryDto);
    //@IterableMapping(qualifiedByName = "statusHistoryToStatusHistoryDto")

}
