package kakao.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Reservation implements Comparable<Reservation> {
    private Long id;
    private LocalDate date;
    private LocalTime time;
    private String name;
    private Theme theme;

    @Builder
    public Reservation(Long id, LocalDate date, LocalTime time, String name, Theme theme) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.name = name;
        this.theme  = theme;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int compareTo(Reservation reservation) {
        return Long.compare(this.id, reservation.id);
    }

    public boolean isDuplicate(LocalDate date, LocalTime time) {
        if (this.date.equals(date) && this.time.equals(time)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reservation that = (Reservation) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getDate(), that.getDate())
                && Objects.equals(getTime(), that.getTime()) && Objects.equals(getName(),
                that.getName()) && Objects.equals(getTheme(), that.getTheme());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDate(), getTime(), getName(), getTheme());
    }
}
