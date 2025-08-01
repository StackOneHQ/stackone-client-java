/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.stackone.stackone_client_java.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stackone.stackone_client_java.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;


public class AtsUpdateBackgroundCheckResultRequestDto {
    /**
     * Unique identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("score")
    private JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoScore> score;

    /**
     * The start date of the candidate test
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private JsonNullable<OffsetDateTime> startDate;

    /**
     * The submission date of the candidate test
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("submission_date")
    private JsonNullable<OffsetDateTime> submissionDate;

    /**
     * The summary about the result of the test
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary")
    private JsonNullable<String> summary;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    private JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoResult> result;

    /**
     * The test`s result url
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result_url")
    private JsonNullable<String> resultUrl;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attachments")
    private JsonNullable<? extends List<Attachment>> attachments;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("candidate")
    private JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoCandidate> candidate;

    /**
     * Value to pass through to the provider
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("passthrough")
    private JsonNullable<? extends Map<String, Object>> passthrough;

    @JsonCreator
    public AtsUpdateBackgroundCheckResultRequestDto(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("score") JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoScore> score,
            @JsonProperty("start_date") JsonNullable<OffsetDateTime> startDate,
            @JsonProperty("submission_date") JsonNullable<OffsetDateTime> submissionDate,
            @JsonProperty("summary") JsonNullable<String> summary,
            @JsonProperty("result") JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoResult> result,
            @JsonProperty("result_url") JsonNullable<String> resultUrl,
            @JsonProperty("attachments") JsonNullable<? extends List<Attachment>> attachments,
            @JsonProperty("candidate") JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoCandidate> candidate,
            @JsonProperty("passthrough") JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(score, "score");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(submissionDate, "submissionDate");
        Utils.checkNotNull(summary, "summary");
        Utils.checkNotNull(result, "result");
        Utils.checkNotNull(resultUrl, "resultUrl");
        Utils.checkNotNull(attachments, "attachments");
        Utils.checkNotNull(candidate, "candidate");
        Utils.checkNotNull(passthrough, "passthrough");
        this.id = id;
        this.score = score;
        this.startDate = startDate;
        this.submissionDate = submissionDate;
        this.summary = summary;
        this.result = result;
        this.resultUrl = resultUrl;
        this.attachments = attachments;
        this.candidate = candidate;
        this.passthrough = passthrough;
    }
    
    public AtsUpdateBackgroundCheckResultRequestDto() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(),
            JsonNullable.undefined());
    }

    /**
     * Unique identifier
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateBackgroundCheckResultRequestDtoScore> score() {
        return (JsonNullable<AtsUpdateBackgroundCheckResultRequestDtoScore>) score;
    }

    /**
     * The start date of the candidate test
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> startDate() {
        return startDate;
    }

    /**
     * The submission date of the candidate test
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> submissionDate() {
        return submissionDate;
    }

    /**
     * The summary about the result of the test
     */
    @JsonIgnore
    public JsonNullable<String> summary() {
        return summary;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateBackgroundCheckResultRequestDtoResult> result() {
        return (JsonNullable<AtsUpdateBackgroundCheckResultRequestDtoResult>) result;
    }

    /**
     * The test`s result url
     */
    @JsonIgnore
    public JsonNullable<String> resultUrl() {
        return resultUrl;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Attachment>> attachments() {
        return (JsonNullable<List<Attachment>>) attachments;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<AtsUpdateBackgroundCheckResultRequestDtoCandidate> candidate() {
        return (JsonNullable<AtsUpdateBackgroundCheckResultRequestDtoCandidate>) candidate;
    }

    /**
     * Value to pass through to the provider
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, Object>> passthrough() {
        return (JsonNullable<Map<String, Object>>) passthrough;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * Unique identifier
     */
    public AtsUpdateBackgroundCheckResultRequestDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier
     */
    public AtsUpdateBackgroundCheckResultRequestDto withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AtsUpdateBackgroundCheckResultRequestDto withScore(AtsUpdateBackgroundCheckResultRequestDtoScore score) {
        Utils.checkNotNull(score, "score");
        this.score = JsonNullable.of(score);
        return this;
    }

    public AtsUpdateBackgroundCheckResultRequestDto withScore(JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoScore> score) {
        Utils.checkNotNull(score, "score");
        this.score = score;
        return this;
    }

    /**
     * The start date of the candidate test
     */
    public AtsUpdateBackgroundCheckResultRequestDto withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = JsonNullable.of(startDate);
        return this;
    }

    /**
     * The start date of the candidate test
     */
    public AtsUpdateBackgroundCheckResultRequestDto withStartDate(JsonNullable<OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The submission date of the candidate test
     */
    public AtsUpdateBackgroundCheckResultRequestDto withSubmissionDate(OffsetDateTime submissionDate) {
        Utils.checkNotNull(submissionDate, "submissionDate");
        this.submissionDate = JsonNullable.of(submissionDate);
        return this;
    }

    /**
     * The submission date of the candidate test
     */
    public AtsUpdateBackgroundCheckResultRequestDto withSubmissionDate(JsonNullable<OffsetDateTime> submissionDate) {
        Utils.checkNotNull(submissionDate, "submissionDate");
        this.submissionDate = submissionDate;
        return this;
    }

    /**
     * The summary about the result of the test
     */
    public AtsUpdateBackgroundCheckResultRequestDto withSummary(String summary) {
        Utils.checkNotNull(summary, "summary");
        this.summary = JsonNullable.of(summary);
        return this;
    }

    /**
     * The summary about the result of the test
     */
    public AtsUpdateBackgroundCheckResultRequestDto withSummary(JsonNullable<String> summary) {
        Utils.checkNotNull(summary, "summary");
        this.summary = summary;
        return this;
    }

    public AtsUpdateBackgroundCheckResultRequestDto withResult(AtsUpdateBackgroundCheckResultRequestDtoResult result) {
        Utils.checkNotNull(result, "result");
        this.result = JsonNullable.of(result);
        return this;
    }

    public AtsUpdateBackgroundCheckResultRequestDto withResult(JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoResult> result) {
        Utils.checkNotNull(result, "result");
        this.result = result;
        return this;
    }

    /**
     * The test`s result url
     */
    public AtsUpdateBackgroundCheckResultRequestDto withResultUrl(String resultUrl) {
        Utils.checkNotNull(resultUrl, "resultUrl");
        this.resultUrl = JsonNullable.of(resultUrl);
        return this;
    }

    /**
     * The test`s result url
     */
    public AtsUpdateBackgroundCheckResultRequestDto withResultUrl(JsonNullable<String> resultUrl) {
        Utils.checkNotNull(resultUrl, "resultUrl");
        this.resultUrl = resultUrl;
        return this;
    }

    public AtsUpdateBackgroundCheckResultRequestDto withAttachments(List<Attachment> attachments) {
        Utils.checkNotNull(attachments, "attachments");
        this.attachments = JsonNullable.of(attachments);
        return this;
    }

    public AtsUpdateBackgroundCheckResultRequestDto withAttachments(JsonNullable<? extends List<Attachment>> attachments) {
        Utils.checkNotNull(attachments, "attachments");
        this.attachments = attachments;
        return this;
    }

    public AtsUpdateBackgroundCheckResultRequestDto withCandidate(AtsUpdateBackgroundCheckResultRequestDtoCandidate candidate) {
        Utils.checkNotNull(candidate, "candidate");
        this.candidate = JsonNullable.of(candidate);
        return this;
    }

    public AtsUpdateBackgroundCheckResultRequestDto withCandidate(JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoCandidate> candidate) {
        Utils.checkNotNull(candidate, "candidate");
        this.candidate = candidate;
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public AtsUpdateBackgroundCheckResultRequestDto withPassthrough(Map<String, Object> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = JsonNullable.of(passthrough);
        return this;
    }

    /**
     * Value to pass through to the provider
     */
    public AtsUpdateBackgroundCheckResultRequestDto withPassthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
        Utils.checkNotNull(passthrough, "passthrough");
        this.passthrough = passthrough;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtsUpdateBackgroundCheckResultRequestDto other = (AtsUpdateBackgroundCheckResultRequestDto) o;
        return 
            Utils.enhancedDeepEquals(this.id, other.id) &&
            Utils.enhancedDeepEquals(this.score, other.score) &&
            Utils.enhancedDeepEquals(this.startDate, other.startDate) &&
            Utils.enhancedDeepEquals(this.submissionDate, other.submissionDate) &&
            Utils.enhancedDeepEquals(this.summary, other.summary) &&
            Utils.enhancedDeepEquals(this.result, other.result) &&
            Utils.enhancedDeepEquals(this.resultUrl, other.resultUrl) &&
            Utils.enhancedDeepEquals(this.attachments, other.attachments) &&
            Utils.enhancedDeepEquals(this.candidate, other.candidate) &&
            Utils.enhancedDeepEquals(this.passthrough, other.passthrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            id, score, startDate,
            submissionDate, summary, result,
            resultUrl, attachments, candidate,
            passthrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AtsUpdateBackgroundCheckResultRequestDto.class,
                "id", id,
                "score", score,
                "startDate", startDate,
                "submissionDate", submissionDate,
                "summary", summary,
                "result", result,
                "resultUrl", resultUrl,
                "attachments", attachments,
                "candidate", candidate,
                "passthrough", passthrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private JsonNullable<String> id = JsonNullable.undefined();

        private JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoScore> score = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> startDate = JsonNullable.undefined();

        private JsonNullable<OffsetDateTime> submissionDate = JsonNullable.undefined();

        private JsonNullable<String> summary = JsonNullable.undefined();

        private JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoResult> result = JsonNullable.undefined();

        private JsonNullable<String> resultUrl = JsonNullable.undefined();

        private JsonNullable<? extends List<Attachment>> attachments = JsonNullable.undefined();

        private JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoCandidate> candidate = JsonNullable.undefined();

        private JsonNullable<? extends Map<String, Object>> passthrough = JsonNullable.undefined();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * Unique identifier
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }


        public Builder score(AtsUpdateBackgroundCheckResultRequestDtoScore score) {
            Utils.checkNotNull(score, "score");
            this.score = JsonNullable.of(score);
            return this;
        }

        public Builder score(JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoScore> score) {
            Utils.checkNotNull(score, "score");
            this.score = score;
            return this;
        }


        /**
         * The start date of the candidate test
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = JsonNullable.of(startDate);
            return this;
        }

        /**
         * The start date of the candidate test
         */
        public Builder startDate(JsonNullable<OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }


        /**
         * The submission date of the candidate test
         */
        public Builder submissionDate(OffsetDateTime submissionDate) {
            Utils.checkNotNull(submissionDate, "submissionDate");
            this.submissionDate = JsonNullable.of(submissionDate);
            return this;
        }

        /**
         * The submission date of the candidate test
         */
        public Builder submissionDate(JsonNullable<OffsetDateTime> submissionDate) {
            Utils.checkNotNull(submissionDate, "submissionDate");
            this.submissionDate = submissionDate;
            return this;
        }


        /**
         * The summary about the result of the test
         */
        public Builder summary(String summary) {
            Utils.checkNotNull(summary, "summary");
            this.summary = JsonNullable.of(summary);
            return this;
        }

        /**
         * The summary about the result of the test
         */
        public Builder summary(JsonNullable<String> summary) {
            Utils.checkNotNull(summary, "summary");
            this.summary = summary;
            return this;
        }


        public Builder result(AtsUpdateBackgroundCheckResultRequestDtoResult result) {
            Utils.checkNotNull(result, "result");
            this.result = JsonNullable.of(result);
            return this;
        }

        public Builder result(JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoResult> result) {
            Utils.checkNotNull(result, "result");
            this.result = result;
            return this;
        }


        /**
         * The test`s result url
         */
        public Builder resultUrl(String resultUrl) {
            Utils.checkNotNull(resultUrl, "resultUrl");
            this.resultUrl = JsonNullable.of(resultUrl);
            return this;
        }

        /**
         * The test`s result url
         */
        public Builder resultUrl(JsonNullable<String> resultUrl) {
            Utils.checkNotNull(resultUrl, "resultUrl");
            this.resultUrl = resultUrl;
            return this;
        }


        public Builder attachments(List<Attachment> attachments) {
            Utils.checkNotNull(attachments, "attachments");
            this.attachments = JsonNullable.of(attachments);
            return this;
        }

        public Builder attachments(JsonNullable<? extends List<Attachment>> attachments) {
            Utils.checkNotNull(attachments, "attachments");
            this.attachments = attachments;
            return this;
        }


        public Builder candidate(AtsUpdateBackgroundCheckResultRequestDtoCandidate candidate) {
            Utils.checkNotNull(candidate, "candidate");
            this.candidate = JsonNullable.of(candidate);
            return this;
        }

        public Builder candidate(JsonNullable<? extends AtsUpdateBackgroundCheckResultRequestDtoCandidate> candidate) {
            Utils.checkNotNull(candidate, "candidate");
            this.candidate = candidate;
            return this;
        }


        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(Map<String, Object> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = JsonNullable.of(passthrough);
            return this;
        }

        /**
         * Value to pass through to the provider
         */
        public Builder passthrough(JsonNullable<? extends Map<String, Object>> passthrough) {
            Utils.checkNotNull(passthrough, "passthrough");
            this.passthrough = passthrough;
            return this;
        }

        public AtsUpdateBackgroundCheckResultRequestDto build() {

            return new AtsUpdateBackgroundCheckResultRequestDto(
                id, score, startDate,
                submissionDate, summary, result,
                resultUrl, attachments, candidate,
                passthrough);
        }

    }
}
