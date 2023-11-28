import 'package:flutter/material.dart';
import 'package:background_callcard/background_callcard.dart';

class CallCardWidget extends StatefulWidget {
  const CallCardWidget({super.key});

  @override
  State<CallCardWidget> createState() => _CallCardWidgetState();
}

class _CallCardWidgetState extends State<CallCardWidget> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        color: Colors.grey,
        child: Center(
          child: ElevatedButton(
              onPressed: () async {
                // await _overlayCallCardPlugin.closeOverlayView();
                await BackgroundCallcard.closeCallcard({'key': 'value'});
              },
              child: StreamBuilder<dynamic>(
                stream: BackgroundCallcard.dataListener,
                builder: (context, snapshot) {
                  print('************************************** snapshot.hasData : ${snapshot.hasData}');
                  if (snapshot.hasData) {
                    return Text('Close Overlay View\n${snapshot.data}');
                  }
                  return const Text('Close Overlay View');
                },
              )),
        ),
      ),
    );
  }
}