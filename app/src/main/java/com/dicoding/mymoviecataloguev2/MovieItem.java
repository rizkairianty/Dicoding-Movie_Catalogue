package com.dicoding.mymoviecataloguev2;

import org.json.JSONObject;

public class MovieItem {
    private String judul, overview, releaseDate, moviePoster;
    private double vote,voteCount;
    private int id;

    public MovieItem(JSONObject object) {
        try {
            int id = object.getInt("id");
            String judul = object.getString("title");
            String overview = object.getString("overview");
            String releaseDate = object.getString("release_date");
            String moviePoster = object.getString("poster_path");
            double vote = object.getDouble("vote_average");
            double voteCount = object.getDouble("vote_count");

            this.id = id;
            this.judul = judul;
            this.overview = overview;
            this.releaseDate = releaseDate;
            this.moviePoster = moviePoster;
            this.vote = vote;
            this.voteCount = voteCount;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public MovieItem(){

    }

    public String getPoster() {
        return moviePoster;
    }

    public void setPoster(String ivPoster) {
        this.moviePoster = ivPoster;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVote() {
        return vote;
    }

    public void setVote(double vote) {
        this.vote = vote;
    }

    public double getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(double voteCount) {
        this.voteCount = voteCount;
    }
}
