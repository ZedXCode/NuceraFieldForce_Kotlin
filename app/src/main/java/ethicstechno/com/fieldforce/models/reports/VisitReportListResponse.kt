package ethicstechno.com.fieldforce.models.reports

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import ethicstechno.com.fieldforce.models.moreoption.visit.InquiryResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class VisitReportListResponse(
    @SerializedName("VisitId") val visitId: Int,
    @SerializedName("CategoryMasterId") val categoryMasterId: Int,
    @SerializedName("CategoryName") val categoryName: String,
    @SerializedName("AccountMasterId") val accountMasterId: Int,
    @SerializedName("AccountName") val accountName: String,
    @SerializedName("CityId") val cityId: Int,
    @SerializedName("CityName") val cityName: String,
    @SerializedName("ContactPersonName") val contactPersonName: String,
    @SerializedName("VisitDetails") val visitDetails: String,
    @SerializedName("NextVisitDateTime") val nextVisitDateTime: String,
    @SerializedName("NextVisitSubject") val nextVisitSubject: String,
    @SerializedName("Remakrs") val remarks: String,
    @SerializedName("FilePath") val filePath: String,
    @SerializedName("Latitude") val latitude: Double,
    @SerializedName("Longitude") val longitude: Double,
    @SerializedName("Location") val location: String,
    @SerializedName("TripId") val tripId: Int,
    @SerializedName("PreviousVisitId") val previousVisitId: Int,
    @SerializedName("MapKM") val mapKM: Double,
    @SerializedName("IsActive") val isActive: Boolean,
    @SerializedName("CommandId") val commandId: Int,
    @SerializedName("CreateBy") val createBy: Int,
    @SerializedName("CreateDateTime") val createDateTime: String,
    @SerializedName("UpdateBy") val updateBy: Int,
    @SerializedName("UpdateDateTime") val updateDateTime: String?,
    @SerializedName("Deleteby") val deleteBy: Int,
    @SerializedName("DeleteDateTime") val deleteDateTime: String?,
    @SerializedName("UserId") val userId: Int,
    @SerializedName("VisitDate") val visitDate: String,
    @SerializedName("VisitTime") val visitTime: String,
    @SerializedName("StartDate") val startDate: String?,
    @SerializedName("EndDate") val endDate: String?,
    @SerializedName("NextVisitDate") val nextVisitDate: String,
    @SerializedName("NextVisitTime") val nextVisitTime: String,
    @SerializedName("CompanyMasterId") val companyMasterId: Int,
    @SerializedName("BranchMasterId") val branchMasterId: Int,
    @SerializedName("DivisionMasterId") val divisionMasterId: Int,
    @SerializedName("DDMVisitTypeId") val ddmVisitTypeId: Int,
    @SerializedName("ModeOfCommunication") val modeOfCommunication: Int,
    @SerializedName("StartTime") val startTime: String,
    @SerializedName("EndTime") val endTime: String,
    @SerializedName("VisitStatus") val visitStatus: Int,
    @SerializedName("DDMStageId") val ddmStageId: Int,
    @SerializedName("SelfieFilePath") val selfieFilePath: String,
    @SerializedName("FilePath2") val filePath2: String,
    @SerializedName("FilePath3") val filePath3: String,
    @SerializedName("FilePath4") val filePath4: String,
    @SerializedName("CompanyName") val companyName: String,
    @SerializedName("BranchName") val branchName: String,
    @SerializedName("DivisionName") val divisionName: String,
    @SerializedName("DMDStageName") val dmdStageName: String,
    @SerializedName("DMDVisitTypeName") val dmdVisitTypeName: String,
    @SerializedName("DocumentNo") val documentNo: Int,
    @SerializedName("ParameterString") val parameterString: String?,
    @SerializedName("listInquiryFilter") val listInquiryFilter: List<InquiryResponse>,
    @SerializedName("Success") val success: Boolean,
    @SerializedName("ReturnMessage") val returnMessage: String?
) : Parcelable {

    constructor() : this(
        visitId = 0,
        categoryMasterId = 0,
        categoryName = "",
        accountMasterId = 0,
        accountName = "",
        cityId = 0,
        cityName = "",
        contactPersonName = "",
        visitDetails = "",
        nextVisitDateTime = "",
        nextVisitSubject = "",
        remarks = "",
        filePath = "",
        latitude = 0.0,
        longitude = 0.0,
        location = "",
        tripId = 0,
        previousVisitId = 0,
        mapKM = 0.0,
        isActive = false,
        commandId = 0,
        createBy = 0,
        createDateTime = "",
        updateBy = 0,
        updateDateTime = null,
        deleteBy = 0,
        deleteDateTime = null,
        userId = 0,
        visitDate = "",
        visitTime = "",
        startDate = null,
        endDate = null,
        nextVisitDate = "",
        nextVisitTime = "",
        companyMasterId = 0,
        branchMasterId = 0,
        divisionMasterId = 0,
        ddmVisitTypeId = 0,
        modeOfCommunication = 0,
        startTime = "",
        endTime = "",
        visitStatus = 0,
        ddmStageId = 0,
        selfieFilePath = "",
        filePath2 = "",
        filePath3 = "",
        filePath4 = "",
        companyName = "",
        branchName = "",
        divisionName = "",
        dmdStageName = "",
        dmdVisitTypeName = "",
        documentNo = 0,
        parameterString = null,
        listInquiryFilter = emptyList(),
        success = false,
        returnMessage = null
    )
}
