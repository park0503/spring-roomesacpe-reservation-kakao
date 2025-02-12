package kakao.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    // 공통 에러
    INTERNAL_SERVER_ERROR(500, "서버 내부 에러입니다. 관리자에게 문의해 주세요."),
    API_NOT_FOUND(404, "잘못된 API 요청입니다."),
    INVALID_BODY_FIELD(400, "바디의 필드가 잘못된 형식이거나 누락되었습니다."),
    INVALID_PATH_VAR_OR_QUERY_PARAMETER(400, "경로 변수나 쿼리 파라미터가 잘못된 형식이거나 누락되었습니다."),

    // 예약 에러
    DUPLICATE_RESERVATION(400, "해당 시간에 예약이 존재합니다."),
    RESERVATION_NOT_FOUND(400, "해당 ID의 예약이 존재하지 않습니다."),

    // 테마 에러
    THEME_NOT_FOUND(400, "해당 ID의 테마가 존재하지 않습니다."),
    THEME_RESERVATIONS_YET_EXIST(400, "해당 테마의 예약건이 아직 존재합니다."),
    THEME_CANT_BE_UPDATED(400, "테마를 해당 요청대로 업데이트할 수 없습니다.");

    private final int status;
    private final String message;
}
