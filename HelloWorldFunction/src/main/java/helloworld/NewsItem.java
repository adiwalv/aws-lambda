package helloworld;

import lombok.Data;
import lombok.ToString;


@Data
public class NewsItem {
  private String title;
  private String pubDate;

  @Override
  public String toString() {
    return String.format("{\"title\": \"%s\", \"date\": \"%s\"}", this.title, this.pubDate);
  }
}
