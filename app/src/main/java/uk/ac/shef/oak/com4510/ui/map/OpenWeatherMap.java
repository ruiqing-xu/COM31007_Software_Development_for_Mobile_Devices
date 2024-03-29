package uk.ac.shef.oak.com4510.ui.map;
import java.util.List;

/**
 * OpenWeatherMap.java
 * @author Feng Li, Ruiqing Xu
 */

public class OpenWeatherMap {

    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private long id;
    private String name;
    private int cod;
    public void setCoord(Coord coord) {
         this.coord = coord;
     }
     public Coord getCoord() {
         return coord;
     }

    public void setWeather(List<Weather> weather) {
         this.weather = weather;
     }
     public List<Weather> getWeather() {
         return weather;
     }

    public void setBase(String base) {
         this.base = base;
     }
     public String getBase() {
         return base;
     }

    public void setMain(Main main) {
         this.main = main;
     }
     public Main getMain() {
         return main;
     }

    public void setVisibility(int visibility) {
         this.visibility = visibility;
     }
     public int getVisibility() {
         return visibility;
     }

    public void setWind(Wind wind) {
         this.wind = wind;
     }
     public Wind getWind() {
         return wind;
     }

    public void setClouds(Clouds clouds) {
         this.clouds = clouds;
     }
     public Clouds getClouds() {
         return clouds;
     }

    public void setDt(long dt) {
         this.dt = dt;
     }
     public long getDt() {
         return dt;
     }

    public void setSys(Sys sys) {
         this.sys = sys;
     }
     public Sys getSys() {
         return sys;
     }

    public void setTimezone(int timezone) {
         this.timezone = timezone;
     }
     public int getTimezone() {
         return timezone;
     }

    public void setId(long id) {
         this.id = id;
     }
     public long getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setCod(int cod) {
         this.cod = cod;
     }
     public int getCod() {
         return cod;
     }

}