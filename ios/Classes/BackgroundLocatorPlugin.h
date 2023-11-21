#import <Flutter/Flutter.h>
#import <CoreLocation/CoreLocation.h>
#import "MethodCallHelper.h"

@interface BackgroundCallcardPlugin : NSObject<FlutterPlugin, CLLocationManagerDelegate, MethodCallHelperDelegate>

+ (BackgroundCallcardPlugin*_Nullable) getInstance;
- (void)invokeMethod:(NSString*_Nonnull)method arguments:(id _Nullable)arguments;

@end
