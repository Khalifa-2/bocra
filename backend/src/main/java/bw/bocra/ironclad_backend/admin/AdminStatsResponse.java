package bw.bocra.ironclad_backend.admin;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdminStatsResponse {

      // Complaints
      private Long totalComplaints;
      private Long complaintsSubmitted;
      private Long complaintsUnderReview;
      private Long complaintsInProgress;
      private Long complaintsResolved;
      private Long complaintsClosed;

      // Licenses
      private Long totalLicenses;
      private Long licensesPending;
      private Long licensesActive;
      private Long licensesSuspended;
      private Long licensesExpired;
      private Long licensesRevoked;

      // Publications
      private Long totalPublications;

      // Domains
      private Long totalDomains;
      private Long domainsActive;
      private Long domainsExpired;
      private Long domainsSuspended;

      // Users
      private Long totalUsers;
}